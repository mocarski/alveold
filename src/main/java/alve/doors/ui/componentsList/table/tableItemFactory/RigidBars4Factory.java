package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Module;
import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.doorsDesigner.fulfillmentType.FulfillmentType;
import alve.doors.ui.componentsList.table.model.TableItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RigidBars4Factory implements ListItemsFactory {
    @Override
    public List<TableItem> create(Wardrobe wardrobe) {
        RigidBarLengthCalculator calculator = new RigidBarLengthCalculator(new ModulePositionDetector());
        return create(wardrobe, calculator);
    }

    public List<TableItem> create(Wardrobe wardrobe, RigidBarLengthCalculator rigidBarLengthCalculator) {
        Map<Integer, Integer> rigidBars4 = new TreeMap<>();

        for (Door door : wardrobe.getDoors())
            for (Module module : door.getModules()) {
                if (module.getFulfillmentType().equals(FulfillmentType.GLASS)) {
                    int rigidBarLength = rigidBarLengthCalculator.calculate(door, module);
                    rigidBars4.merge(rigidBarLength, 2, Integer::sum);
                }
            }

        List<TableItem> items = new ArrayList<>();

        for (Map.Entry<Integer, Integer> rigidBar4 : rigidBars4.entrySet())
            items.add(new TableItem(
                    Product.RIGID_BAR_TT_4_MM_FILLINGS.getItemCode(),
                    Product.RIGID_BAR_TT_4_MM_FILLINGS.getName(),
                    Integer.toString(rigidBar4.getKey()),
                    rigidBar4.getValue()));

        return items;
    }
}
