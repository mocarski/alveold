package alve.doors.ui.doorsDesigner.fulfillmentType;

import alve.doors.ui.model.Module;
import com.vaadin.data.Binder;
import com.vaadin.ui.NativeSelect;
import java.util.ArrayList;
import java.util.List;

public class FulfillmentTypeSelect extends NativeSelect<FulfillmentType> {

    public FulfillmentTypeSelect(Module module) {
        setItems(createListOfFulfillmentTypes());
        setEmptySelectionAllowed(false);
        bind(module);
    }

    private List<FulfillmentType> createListOfFulfillmentTypes() {
        List<FulfillmentType> types = new ArrayList<>();
        types.add(FulfillmentType.GLASS);
        types.add(FulfillmentType.BOARD);
        return types;
    }

    private void bind(Module module) {
        Binder<Module> binder = new Binder<>();
        binder.forField(this).bind(Module::getFulfillmentType, Module::setFulfillmentType);
        binder.setBean(module);
    }
}
