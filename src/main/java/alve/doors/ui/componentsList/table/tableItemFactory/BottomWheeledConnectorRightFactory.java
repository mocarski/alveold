package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class BottomWheeledConnectorRightFactory implements ListItemFactory {

    @Override
    public TableItem create(Wardrobe wardrobe) {
        return new TableItem(
                Product.BOTTOM_WHEELED_CONNECTOR_RIGHT.getItemCode(),
                Product.BOTTOM_WHEELED_CONNECTOR_RIGHT.getName(),
                "",
                wardrobe.getDoors().size());
    }
}
