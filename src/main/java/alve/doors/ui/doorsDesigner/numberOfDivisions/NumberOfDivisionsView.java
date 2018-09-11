package alve.doors.ui.doorsDesigner.numberOfDivisions;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.Constants;
import alve.doors.ui.doorsDesigner.fulfillmentHeight.action.UpdateFulfillmentHeightTextFieldsAction;
import alve.doors.ui.doorsDesigner.fulfillmentType.action.CreateFulfillmentTypeSelectAction;
import alve.doors.ui.doorsDesigner.visibility.UpdateVisibility;
import alve.doors.ui.doorsDesigner.visualization.action.UpdateVisualization;
import com.vaadin.ui.*;

import java.util.Iterator;

public class NumberOfDivisionsView extends VerticalLayout {

    private final Wardrobe wardrobe;
    private Label label = new Label(Constants.NUMBER_OF_DIVISIONS);
    private HorizontalLayout layout = new HorizontalLayout();


    public NumberOfDivisionsView(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;

        addComponents(label, layout);
        setComponentAlignment(label, Alignment.TOP_CENTER);

        setWidthUndefined();
        setMargin(false);
        setStyleName("MarginTopAndBottom");
        setVisible(false);
    }

    public void createNumberOfDivisionFieldForEachDoor() {
        layout.removeAllComponents();
        for (Door door : wardrobe.getDoors()) {
            NumberOfDivisionsTextField numberOfDivisionsTextField = new NumberOfDivisionsTextField(door,
                    updateFulfillmentHeightTextFieldsAction, createFulfillmentTypeSelectAction, updateVisualization, updateVisibility);

            layout.addComponent(numberOfDivisionsTextField);
        }
    }

    public boolean isValid() {
        if(!layout.getComponentIterator().hasNext())
            return false;
        for (Iterator<Component> it = layout.getComponentIterator(); it.hasNext(); ) {
            if (!((NumberOfDivisionsTextField) it.next()).isValid())
                return false;
        }

        return true;
    }

    public void setActions(UpdateVisibility updateVisibility, CreateFulfillmentTypeSelectAction createFulfillmentTypeSelectAction,
                           UpdateFulfillmentHeightTextFieldsAction updateFulfillmentHeightTextFieldsAction,
                           UpdateVisualization updateVisualization) {
        this.updateVisibility = updateVisibility;
        this.createFulfillmentTypeSelectAction = createFulfillmentTypeSelectAction;
        this.updateFulfillmentHeightTextFieldsAction = updateFulfillmentHeightTextFieldsAction;
        this.updateVisualization = updateVisualization;
    }

    private UpdateVisibility updateVisibility;
    private CreateFulfillmentTypeSelectAction createFulfillmentTypeSelectAction;
    private UpdateFulfillmentHeightTextFieldsAction updateFulfillmentHeightTextFieldsAction;
    private UpdateVisualization updateVisualization;
}
