package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class TopWheeledConnectorsLeftFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        return new TableItem(
                Product.TOP_WHEELED_CONNECTOR_LEFT.getItemCode(),
                Product.TOP_WHEELED_CONNECTOR_LEFT.getName(),
                "",
                wardrobe.getDoors().size());
    }
}
