package alve.doors.ui.componentsList;


import alve.doors.ui.navigation.model.NavigationState;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;

public class GoToDoorsFormAction implements Button.ClickListener {

    public final Navigator navigator;

    public GoToDoorsFormAction(Navigator navigator)
    {
        this.navigator = navigator;
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        navigator.navigateTo(NavigationState.Wardrobe.toString());
    }

    public void add(Button button){
        button.addClickListener(this);
    }
}
