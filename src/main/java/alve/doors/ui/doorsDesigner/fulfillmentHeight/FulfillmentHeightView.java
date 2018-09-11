package alve.doors.ui.doorsDesigner.fulfillmentHeight;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Module;
import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.Constants;
import alve.doors.ui.doorsDesigner.fulfillmentHeight.action.UpdateValidityOfFulfillmentHeightsAction;
import alve.doors.ui.doorsDesigner.visibility.UpdateVisibility;
import alve.doors.ui.doorsDesigner.visualization.action.UpdateVisualizationWhenCorrectModuleHeights;
import com.vaadin.ui.*;

import java.util.LinkedList;
import java.util.List;

public class FulfillmentHeightView extends VerticalLayout {

    private final Wardrobe wardrobe;
    private Label label = new Label(Constants.HEIGHT_OF_FILLINGS);
    private HorizontalLayout layoutForAllDoors = new HorizontalLayout();


    public FulfillmentHeightView(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;

        layoutForAllDoors.setMargin(false);
        addComponents(label, layoutForAllDoors);
        setComponentAlignment(label, Alignment.TOP_CENTER);

        setWidthUndefined();
        setMargin(false);
        setStyleName("MarginTopAndBottom");
        setVisible(false);
    }

    public void createFulfillmentHeightTextFields(){
        layoutForAllDoors.removeAllComponents();
        for(Door door : wardrobe.getDoors()){
            layoutForAllDoors.addComponent(createLayoutWithTextFieldsForSingleDoor(door));
        }
        updateVisibility.valueChange(null);
    }

    public boolean isValid() {
        if(getAllHeightOfFillingsTextFields().size()==0)
            return false;
        for(FulfillmentHeightTextField fulfillmentHeightTextField : getAllHeightOfFillingsTextFields()){
            if(!fulfillmentHeightTextField.isValid())
                return false;
        }

        return true;
    }

    public void validate() {
        for(FulfillmentHeightTextField fulfillmentHeightTextField : getAllHeightOfFillingsTextFields()){
            fulfillmentHeightTextField.validate();
        }
    }

    public void setActions(UpdateVisualizationWhenCorrectModuleHeights
                                   updateVisualizationWhenCorrectModuleHeights,
                           UpdateVisibility updateVisibility,
                           UpdateValidityOfFulfillmentHeightsAction updateValidityOfFulfillmentHeightsAction){
        this.updateVisualizationWhenCorrectModuleHeights = updateVisualizationWhenCorrectModuleHeights;
        this.updateVisibility = updateVisibility;
        this.updateValidityOfFulfillmentHeightsAction = updateValidityOfFulfillmentHeightsAction;
    }

    private VerticalLayout createLayoutWithTextFieldsForSingleDoor(Door door) {
        VerticalLayout fulfillmentHeightsForSingleDoor = new VerticalLayout();
        fulfillmentHeightsForSingleDoor.setMargin(false);
        for(Module module : door.getModules()) {
            FulfillmentHeightTextField fulfillmentHeightTextField = new FulfillmentHeightTextField(door, module);
            fulfillmentHeightTextField.addValueChangeListener(updateVisibility);
            fulfillmentHeightTextField.addValueChangeListener(updateVisualizationWhenCorrectModuleHeights);
            fulfillmentHeightTextField.addValueChangeListener(updateValidityOfFulfillmentHeightsAction);
            fulfillmentHeightsForSingleDoor.addComponent(fulfillmentHeightTextField);
        }
        return fulfillmentHeightsForSingleDoor;
    }

    private List<FulfillmentHeightTextField> getAllHeightOfFillingsTextFields(){
        List<FulfillmentHeightTextField> fulfillmentHeightTextFieldList = new LinkedList<>();
        for(Component verticalLayouts : (Iterable<Component>) () -> layoutForAllDoors.getComponentIterator()){
            for(Component textFields : (Iterable<Component>) () -> ((VerticalLayout)verticalLayouts).getComponentIterator())
                fulfillmentHeightTextFieldList.add((FulfillmentHeightTextField) textFields);
        }

        return fulfillmentHeightTextFieldList;
    }

    private UpdateVisualizationWhenCorrectModuleHeights updateVisualizationWhenCorrectModuleHeights;
    private UpdateVisibility updateVisibility;
    private UpdateValidityOfFulfillmentHeightsAction updateValidityOfFulfillmentHeightsAction;
}
