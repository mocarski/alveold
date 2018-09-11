package alve.doors.ui.componentsList.table.action;

import alve.doors.ui.componentsList.table.TableItemProvider;
import alve.doors.ui.componentsList.table.TableOfIntermediates;

public class FillTableAction {

    private final TableItemProvider tableItemProvider;

    public FillTableAction(TableItemProvider tableItemProvider) {
        this.tableItemProvider = tableItemProvider;
    }

    public void execute(TableOfIntermediates table) {
        table.setItems(tableItemProvider.createWardrobeIntermediates());
    }
}
