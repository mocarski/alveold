package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class VeneeredSelfAdhesiveTapeFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        return new TableItem(
                Product.getVeeneredSelfAdhesiveTape(wardrobe.getDoorFrameColour()).getItemCode(),
                Product.getVeeneredSelfAdhesiveTape(wardrobe.getDoorFrameColour()).getName(),
                Integer.toString(wardrobe.getCavityWidth()),
                1);
    }
}
