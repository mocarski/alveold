package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class BottomWheeledConnectorLeftFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {

        return new TableItem(
                Product.BOTTOM_WHEELED_CONNECTOR_LEFT.getItemCode(),
                Product.BOTTOM_WHEELED_CONNECTOR_LEFT.getName(),
                "",
                wardrobe.getDoors().size());
    }
}
