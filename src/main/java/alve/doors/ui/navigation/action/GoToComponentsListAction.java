package alve.doors.ui.navigation.action;


import alve.doors.ui.navigation.model.NavigationState;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;

public class GoToComponentsListAction implements Button.ClickListener {

    private final Navigator navigator;

    public GoToComponentsListAction(Navigator navigator )
    {
        this.navigator = navigator;
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        navigator.navigateTo( NavigationState.Components.toString() );
    }
}
