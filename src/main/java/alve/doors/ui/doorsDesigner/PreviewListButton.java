package alve.doors.ui.doorsDesigner;

import alve.doors.ui.navigation.action.GoToComponentsListAction;
import alve.doors.ui.Constants;
import com.vaadin.ui.Button;

public class PreviewListButton extends Button {

    public PreviewListButton(GoToComponentsListAction goToComponentsListAction) {
        addClickListener(goToComponentsListAction);

        setCaption(Constants.PREVIEW_PRODUCTION_LIST);
        setStyleName("MarginTopAndBottom");
        setEnabled(false);
    }
}
