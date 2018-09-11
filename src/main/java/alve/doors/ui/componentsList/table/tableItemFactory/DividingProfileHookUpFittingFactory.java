package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class DividingProfileHookUpFittingFactory implements ListItemFactory {
    @Override
    public TableItem create(Wardrobe wardrobe) {
        return new TableItem(
                Product.DIVIDING_PROFILE_HOOKUP_FITTING.getItemCode(),
                Product.DIVIDING_PROFILE_HOOKUP_FITTING.getName(),
                "",
                countNumberOfDividingProfiles(wardrobe));
    }

    private int countNumberOfDividingProfiles(Wardrobe wardrobe) {
        int numberOfDividingProfiles = 0;
        for (Door door : wardrobe.getDoors()) {
            numberOfDividingProfiles += 2 * door.getNumberOfDivisions();
        }

        return numberOfDividingProfiles;
    }
}
