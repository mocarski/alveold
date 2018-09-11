package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class AluminiumDoubleBottomTrackFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        return new TableItem(
                Product.ALUMINIUM_DOUBLE_BOTTOM_TRACK.getItemCode(),
                Product.ALUMINIUM_DOUBLE_BOTTOM_TRACK.getName(),
                Integer.toString(wardrobe.getCavityWidth()),
                1);
    }
}
