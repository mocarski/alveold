package alve.doors.ui.doorsDesigner.fulfillmentHeight;

import alve.doors.ui.model.Door;
import alve.doors.ui.model.Module;
import alve.doors.ui.Constants;
import com.google.common.base.Strings;
import com.vaadin.data.Binder;
import com.vaadin.ui.TextField;

public class FulfillmentHeightTextField extends TextField {

    private final Door door;
    private final Module module;
    private Binder<Module> binder = new Binder<>();

    public FulfillmentHeightTextField(Door door, Module module){
        this.door = door;
        this.module = module;
        setPlaceholder(Constants.HEIGHT_OF_FILLING);
        bindModuleWithDivisionTextField();
    }

    private void bindModuleWithDivisionTextField() {
        binder.forField(this)
                .asRequired("The height of fulfillmentType is required")
                .withConverter(Integer::valueOf, String::valueOf, "Input value should be a number")
                .withValidator(divisionValue -> divisionValue <= door.getHeight(),
                        "The value of the fulfillmentType can not be higher than hight of the wardrobe")
                .withValidator(new FulfillmentHeightValidator(door, module))
                .bind(Module::getHeight, Module::setHeight);

        binder.setBean(module);
    }

    public boolean isValid() {
        return binder.isValid() && !Strings.isNullOrEmpty(this.getValue());
    }

    public void validate() {
        binder.validate();
    }
}
