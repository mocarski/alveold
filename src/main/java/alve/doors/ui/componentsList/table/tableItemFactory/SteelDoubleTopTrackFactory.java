package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class SteelDoubleTopTrackFactory implements ListItemFactory {

    @Override
    public TableItem create(Wardrobe wardrobe) {
        return new TableItem(
                Product.STEEL_DOUBLE_TOP_TRACK.getItemCode(),
                Product.STEEL_DOUBLE_TOP_TRACK.getName(),
                Integer.toString(wardrobe.getCavityWidth()),
                1);
    }
}
