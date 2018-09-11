package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class VerticalProfilesLeftFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        Product verticalProfileLeft = Product.getVerticalProfileLeft(wardrobe.getDoorFrameColour());

        return new TableItem(
                verticalProfileLeft.getItemCode(),
                verticalProfileLeft.getName(),
                Integer.toString(wardrobe.getDoorsHeight()),
                wardrobe.getAmountOfDoors());
    }
}
