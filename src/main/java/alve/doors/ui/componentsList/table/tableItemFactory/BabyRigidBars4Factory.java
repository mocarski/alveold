package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.model.WardrobeToolbox;
import alve.doors.ui.doorsDesigner.fulfillmentType.FulfillmentType;
import alve.doors.ui.componentsList.table.model.TableItem;

public class BabyRigidBars4Factory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {

        int babyRigidBar4mm = WardrobeToolbox.countNumberOfModulesWithFulfillment(FulfillmentType.GLASS,
                wardrobe) * 3;

        return new TableItem(
                Product.BABY_RIGID_BAR_4_MM_FILLINGS.getItemCode(),
                Product.BABY_RIGID_BAR_4_MM_FILLINGS.getName(),
                "",
                babyRigidBar4mm);
    }
}
