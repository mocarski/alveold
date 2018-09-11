package alve.doors.ui.componentsList;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.componentsList.table.TableItemProvider;
import alve.doors.ui.componentsList.table.TableOfIntermediates;
import alve.doors.ui.componentsList.table.action.FillTableAction;
import alve.doors.ui.componentsList.table.action.SetTableTitleAction;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;

public class ComponentsListView extends VerticalLayout implements View {

    private Label tableTitle = new Label();
    private TableOfIntermediates table = TableOfIntermediates.create();
    private Button back = new Button(Constants.BACK_TO_DOOR_DESIGNING);
    private Button print = new Button(Constants.PRINT_PRODUCTION_LIST);
    private Button download = new Button(Constants.DOWNLOAD_PRODUCTION_LIST);

    private final SetTableTitleAction setTableTitleAction;
    private final FillTableAction fillTableAction;
    private final DownloadCuttingListAsPDFAction downloadCuttingListAsPDFAction;
    private final OpenCuttingListAsPDFAction openCuttingListAsPDFAction;


    public ComponentsListView(SetTableTitleAction setTableTitleAction, FillTableAction fillTableAction,
                              GoToDoorsFormAction goToDoorsFormAction,
                              DownloadCuttingListAsPDFAction downloadCuttingListAsPDFAction,
                              OpenCuttingListAsPDFAction openCuttingListAsPDFAction) {
        this.setTableTitleAction = setTableTitleAction;
        this.fillTableAction = fillTableAction;
        this.downloadCuttingListAsPDFAction = downloadCuttingListAsPDFAction;
        this.openCuttingListAsPDFAction = openCuttingListAsPDFAction;

        goToDoorsFormAction.add(back);

        HorizontalLayout tableTitleLayout = createTableTitleLayout(tableTitle);
        HorizontalLayout buttonsLayout = createButtonsLayout(back, this.download, print);
        addComponents(tableTitleLayout, table, buttonsLayout);
        setComponentAlignment(tableTitleLayout, Alignment.MIDDLE_CENTER);
        setComponentAlignment(table, Alignment.MIDDLE_CENTER);
        setComponentAlignment(buttonsLayout, Alignment.MIDDLE_CENTER);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
        setTableTitleAction.execute(tableTitle);
        fillTableAction.execute(table);
        downloadCuttingListAsPDFAction.add(download);
        openCuttingListAsPDFAction.add(print);
    }

    public static ComponentsListView create(Navigator navigator, Wardrobe wardrobe) {
        SetTableTitleAction setTableTitleAction = new SetTableTitleAction(wardrobe);
        FillTableAction fillTableAction = new FillTableAction(new TableItemProvider(wardrobe));
        GoToDoorsFormAction goToDoorsFormAction = new GoToDoorsFormAction(navigator);
        DownloadCuttingListAsPDFAction downloadCuttingListAsPDFAction = new DownloadCuttingListAsPDFAction(wardrobe);
        OpenCuttingListAsPDFAction openCuttingListAsPDFAction = new
                OpenCuttingListAsPDFAction(wardrobe);

        ComponentsListView componentsListView = new ComponentsListView(setTableTitleAction,
                fillTableAction, goToDoorsFormAction, downloadCuttingListAsPDFAction,
                openCuttingListAsPDFAction);

        return componentsListView;
    }

    /*Layout for table title is created only because of wrong label rendering without layout*/
    private static HorizontalLayout createTableTitleLayout(Label tableTitle) {
        HorizontalLayout tableTitleLayout = new HorizontalLayout();
        tableTitleLayout.addComponent(tableTitle);
        tableTitleLayout.setComponentAlignment(tableTitle, Alignment.MIDDLE_CENTER);
        return tableTitleLayout;
    }

    private HorizontalLayout createButtonsLayout(Button back, Button download, Button print) {
        HorizontalLayout buttonsLayout = new HorizontalLayout();
        buttonsLayout.addComponents(back, print, download);
        buttonsLayout.setComponentAlignment(back, Alignment.MIDDLE_LEFT);
        buttonsLayout.setComponentAlignment(print, Alignment.MIDDLE_CENTER);
        buttonsLayout.setComponentAlignment(download, Alignment.MIDDLE_RIGHT);
        buttonsLayout.setWidth(70, Unit.PERCENTAGE);
        return buttonsLayout;
    }
}
