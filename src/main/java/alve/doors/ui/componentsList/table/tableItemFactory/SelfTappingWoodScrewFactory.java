package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.Constants;
import alve.doors.ui.componentsList.table.model.TableItem;

import java.util.LinkedList;
import java.util.List;

public class SelfTappingWoodScrewFactory implements ListItemsFactory {
    @Override
    public List<TableItem> create(Wardrobe wardrobe) {

        List<TableItem> items = new LinkedList<>();

        items.add(new TableItem(
                Product.SELF_TAPPING_WOOD_SCREW_3MM_16MM.getItemCode(),
                Product.SELF_TAPPING_WOOD_SCREW_3MM_16MM.getName(),
                Constants._3MM_16MM,
                calculateAmountOfSelfTappingWoodScrew(wardrobe)));
        items.add(new TableItem(
                Product.SELF_TAPPING_WOOD_SCREW_3MM_25MM.getItemCode(),
                Product.SELF_TAPPING_WOOD_SCREW_3MM_25MM.getName(),
                Constants._3MM_25MM,
                calculateAmountOfSelfTappingWoodScrew(wardrobe)));

        return items;
    }

    private int calculateAmountOfSelfTappingWoodScrew(Wardrobe wardrobe) {
        int result = 0;

        for (Door door : wardrobe.getDoors()) {
            result = result + 8 + door.getNumberOfDivisions() * 2;
        }

        return result;
    }

}
