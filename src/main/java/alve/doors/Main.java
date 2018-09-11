package alve.doors;

import javax.servlet.annotation.WebServlet;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.navigation.model.NavigationState;
import alve.doors.ui.doorsDesigner.WardrobeFormView;
import alve.doors.ui.doorsDesigner.WardrobeFormViewFactory;
import alve.doors.ui.componentsList.ComponentsListView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;


@Theme("mytheme")
public class Main extends com.vaadin.ui.UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Wardrobe wardrobe = new Wardrobe();
        Navigator navigator = new Navigator(this, this);

        WardrobeFormView wardrobeFormView = WardrobeFormViewFactory.create(navigator, wardrobe);
        ComponentsListView componentsListView = ComponentsListView.create(navigator, wardrobe);

        navigator.addView(NavigationState.Wardrobe.toString(), wardrobeFormView);
        navigator.addView(NavigationState.Components.toString(), componentsListView);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = Main.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
