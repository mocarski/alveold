package alve.doors.ui.doorsDesigner.numberOfDivisions.action;

import alve.doors.ui.doorsDesigner.numberOfDivisions.NumberOfDivisionsView;
import com.vaadin.data.HasValue;

public class CreateNumberOfDivisionFieldsAction implements HasValue.ValueChangeListener<String>{

    private final NumberOfDivisionsView numberOfDivisionsView;

    public CreateNumberOfDivisionFieldsAction(NumberOfDivisionsView numberOfDivisionsView)
    {
        this.numberOfDivisionsView = numberOfDivisionsView;
    }


    @Override
    public void valueChange( HasValue.ValueChangeEvent<String> valueChangeEvent )
    {
        numberOfDivisionsView.createNumberOfDivisionFieldForEachDoor();
    }
}
