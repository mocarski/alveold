package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.model.WardrobeToolbox;
import alve.doors.ui.doorsDesigner.fulfillmentType.FulfillmentType;
import alve.doors.ui.componentsList.table.model.TableItem;

public class BabyRigidBars8Factory implements ListItemFactory {

    @Override
    public TableItem create(Wardrobe wardrobe) {

        int babyRigidBar8mm = WardrobeToolbox.countNumberOfModulesWithFulfillment(FulfillmentType.BOARD,
                wardrobe) * 3;

        return new TableItem(
                Product.BABY_RIGID_BAR_8_MM_FILLINGS.getItemCode(),
                Product.BABY_RIGID_BAR_8_MM_FILLINGS.getName(),
                "",
                babyRigidBar8mm);

    }
}
