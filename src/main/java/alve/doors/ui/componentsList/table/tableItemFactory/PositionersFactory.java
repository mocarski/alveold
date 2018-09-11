package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.model.WardrobeToolbox;
import alve.doors.ui.componentsList.table.model.TableItem;

public class PositionersFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        return new TableItem(
                Product.TOP_TRACK_DOOR_POSITIONER.getItemCode(),
                Product.TOP_TRACK_DOOR_POSITIONER.getName(),
                "",
                WardrobeToolbox.countNumberOfPositioners(wardrobe));
    }
}
