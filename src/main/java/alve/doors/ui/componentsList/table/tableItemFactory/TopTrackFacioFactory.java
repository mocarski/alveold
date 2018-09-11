package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.model.TableItem;

public class TopTrackFacioFactory implements ListItemFactory {

    @Override
    public TableItem create(Wardrobe wardrobe) {
        Product topTrackFacio = Product.getTopTrackFacio(wardrobe.getTopTrackFacio());
        return new TableItem(
                topTrackFacio.getItemCode(),
                topTrackFacio.getName(),
                Integer.toString(wardrobe.getCavityWidth()),
                1);
    }
}
