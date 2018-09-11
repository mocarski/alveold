package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Module;

public class ModulePositionDetector {
    /*  _
       | |
       |m|
       |_| */
    public boolean isSingleModule(Door door, Module module) {
        return hasSingleModule(door) && door.getModules().get(0).equals(module);
    }

    /*  _
       |m|
       |_|
       |_| */
    public static boolean isTopModule(Door door, Module module) {
        return getTopModule(door).equals(module);
    }

    /*  _
       |_|
       |_|
       |m| */
    public static boolean isBottomModule(Door door, Module module) {
        return getBottomModule(door).equals(module);
    }

    private boolean hasSingleModule(Door door) {
        return door.getModules().size() == 1;
    }

    private static Module getTopModule(Door door) {
        return door.getModules().get(0);
    }

    private static Module getBottomModule(Door door) {
        return door.getModules().get(door.getAmountOfModules() - 1);
    }
}
