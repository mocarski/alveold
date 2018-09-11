package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class HorizontalProfileTopBottomFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        Product horizontalProfile = Product.getHorizontalProfile(wardrobe.getDoorFrameColour());
        return new TableItem(
                horizontalProfile.getItemCode(),
                horizontalProfile.getName(),
                Integer.toString(getWidthOfHorizontalProfile(wardrobe)),
                wardrobe.getAmountOfDoors() * 2);
    }

    private int getWidthOfHorizontalProfile(Wardrobe wardrobe) {
        return wardrobe.getDoors().get(0).getModules().get(0).getWidth();
    }
}
