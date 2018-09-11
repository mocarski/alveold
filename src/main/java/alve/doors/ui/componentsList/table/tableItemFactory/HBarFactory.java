package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class HBarFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        Product hBar = Product.getHBar(wardrobe.getDoorFrameColour());

        return new TableItem(
                hBar.getItemCode(),
                hBar.getName(),
                Integer.toString(getWidthOfHBars(wardrobe)),
                countNumberOfHBars(wardrobe));
    }

    private int getWidthOfHBars(Wardrobe wardrobe) {
        return wardrobe.getDoors().get(0).getModules().get(0).getWidth();
    }

    private int countNumberOfHBars(Wardrobe wardrobe) {
        int numberOfHBars = 0;
        for (Door door : wardrobe.getDoors()) {
            numberOfHBars += door.getNumberOfDivisions();
        }

        return numberOfHBars;
    }
}
