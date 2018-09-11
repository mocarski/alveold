package alve.doors.ui.doorsDesigner.numberOfDivisions;

import alve.doors.ui.model.Door;
import alve.doors.ui.Constants;
import alve.doors.ui.doorsDesigner.fulfillmentHeight.action.UpdateFulfillmentHeightTextFieldsAction;
import alve.doors.ui.doorsDesigner.fulfillmentType.action.CreateFulfillmentTypeSelectAction;
import alve.doors.ui.doorsDesigner.visibility.UpdateVisibility;
import alve.doors.ui.doorsDesigner.visualization.action.UpdateVisualization;
import com.google.common.base.Strings;
import com.vaadin.data.Binder;
import com.vaadin.data.HasValue;
import com.vaadin.ui.TextField;

public class NumberOfDivisionsTextField extends TextField {

    private Binder<Door> binder = new Binder<>();

    private final UpdateVisibility updateVisibility;
    private final CreateFulfillmentTypeSelectAction createFulfillmentTypeSelectAction;
    private final UpdateVisualization updateVisualization;
    private final UpdateFulfillmentHeightTextFieldsAction updateFulfillmentHeightTextFieldsAction;

    public NumberOfDivisionsTextField(Door door, UpdateFulfillmentHeightTextFieldsAction
            updateFulfillmentHeightTextFieldsAction, CreateFulfillmentTypeSelectAction createFulfillmentTypeSelectAction, UpdateVisualization
            updateVisualization, UpdateVisibility updateVisibility) {
        this.createFulfillmentTypeSelectAction = createFulfillmentTypeSelectAction;
        this.updateVisualization = updateVisualization;
        this.updateFulfillmentHeightTextFieldsAction = updateFulfillmentHeightTextFieldsAction;
        this.updateVisibility = updateVisibility;

        setPlaceholder(Constants.DIVIDERS_AMOUNT);

        // The only way to achieve proper UI behaviour when TextField is binded with int variable and
        // placeholder at the beginning should be shown.
        addValueChangeListener(getNumberOfDividersValueChangeListener(door));
    }

    public boolean isValid() {
        return binder.isValid() && !Strings.isNullOrEmpty(getValue());
    }

    private HasValue.ValueChangeListener<String> getNumberOfDividersValueChangeListener(Door door) {
        return new HasValue.ValueChangeListener() {
            boolean isBinded = false;

            @Override
            public void valueChange(HasValue.ValueChangeEvent valueChangeEvent) {
                if (valueChangeEvent.getOldValue().equals("") && !isBinded) {
                    isBinded = true;
                    bind(door);
                    addValueChangeListener(updateFulfillmentHeightTextFieldsAction);
                    addValueChangeListener(createFulfillmentTypeSelectAction);
                    addValueChangeListener(updateVisualization);
                    addValueChangeListener(updateVisibility);
                    setValue(valueChangeEvent.getValue().toString());
                }
            }
        };
    }

    private Binder<Door> bind(Door door) {
        binder.forField(this)
                .asRequired("Number of numberOfDivisions is required")
                .withConverter(Integer::valueOf, String::valueOf, "Input value should be a number")
                .withValidator(amountOfModules -> amountOfModules <= 5,
                        "Number of numberOfDivisions can not be higher than 5")
                .bind(Door::getNumberOfDivisions, Door::setAmountOfDivision);

        binder.setBean(door);

        return binder;
    }
}
