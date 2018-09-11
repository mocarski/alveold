package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public interface ListItemFactory {
    TableItem create(Wardrobe wardrobe);
}
