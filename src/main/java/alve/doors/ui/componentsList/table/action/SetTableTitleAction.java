package alve.doors.ui.componentsList.table.action;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.Constants;
import com.vaadin.ui.Label;

public class SetTableTitleAction {

    private final Wardrobe wardrobe;

    public SetTableTitleAction(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public void execute(Label label) {
        label.setCaption(Constants.prepareTableTitle(wardrobe.getReferenceName()));
    }
}
