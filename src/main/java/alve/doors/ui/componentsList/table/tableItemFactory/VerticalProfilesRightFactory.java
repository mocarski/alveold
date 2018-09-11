package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class VerticalProfilesRightFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        Product verticalProfileRight = Product.getVerticalProfileRight(wardrobe.getDoorFrameColour());
        return new TableItem(
                verticalProfileRight.getItemCode(),
                verticalProfileRight.getName(),
                Integer.toString(wardrobe.getDoorsHeight()),
                wardrobe.getAmountOfDoors());
    }
}
