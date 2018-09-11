package alve.doors.ui.doorsDesigner.fulfillmentType.action;


import alve.doors.ui.doorsDesigner.fulfillmentType.FulfillmentTypeView;
import com.vaadin.data.HasValue;

public class CreateFulfillmentTypeSelectAction implements HasValue.ValueChangeListener<String>
{
    private final FulfillmentTypeView fulfillmentTypeView;

    public CreateFulfillmentTypeSelectAction(FulfillmentTypeView fulfillmentTypeView)
    {
        this.fulfillmentTypeView = fulfillmentTypeView;
    }


    @Override
    public void valueChange(HasValue.ValueChangeEvent<String> valueChangeEvent)
    {
        fulfillmentTypeView.createFulfillmentSelects();
    }
}
