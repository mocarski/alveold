package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class AluminiumBottomTrackCoverFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        return new TableItem(
                Product.ALUMINIUM_TRACK_COVER.getItemCode(),
                Product.ALUMINIUM_TRACK_COVER.getName(),
                Integer.toString(wardrobe.getCavityWidth()),
                1);
    }
}
