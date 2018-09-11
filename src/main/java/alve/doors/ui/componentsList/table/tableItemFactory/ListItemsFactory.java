package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

import java.util.List;

public interface ListItemsFactory {
    List<TableItem> create(Wardrobe wardrobe);
}
