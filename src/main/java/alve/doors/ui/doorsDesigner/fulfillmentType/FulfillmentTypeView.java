package alve.doors.ui.doorsDesigner.fulfillmentType;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Module;
import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.Constants;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class FulfillmentTypeView extends VerticalLayout {
    Label label = new Label(Constants.TYPE_OF_FILLINGS);
    HorizontalLayout fulfillmentSelectsForAllDoorsLayout = new HorizontalLayout();
    private final Wardrobe wardrobe;

    public FulfillmentTypeView(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;

        addComponents(label, fulfillmentSelectsForAllDoorsLayout);
        setComponentAlignment(label, Alignment.TOP_CENTER);

        fulfillmentSelectsForAllDoorsLayout.setWidthUndefined();
        setWidthUndefined();
        setMargin(false);
        setStyleName("MarginTopAndBottom");
        setVisible(false);
    }

    public void createFulfillmentSelects() {
        fulfillmentSelectsForAllDoorsLayout.removeAllComponents();

        for (Door door : wardrobe.getDoors()) {
            fulfillmentSelectsForAllDoorsLayout.addComponent(createFulfillmentSelectsForDoor(door));
        }
    }

    private VerticalLayout createFulfillmentSelectsForDoor(Door door) {
        VerticalLayout fulfillmentSelectsForDoor = new VerticalLayout();
        fulfillmentSelectsForDoor.setMargin(false);
        for (Module module : door.getModules()) {
            fulfillmentSelectsForDoor.addComponent(new FulfillmentTypeSelect(module));
        }
        return fulfillmentSelectsForDoor;
    }
}
