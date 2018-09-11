package alve.doors.ui.doorsDesigner.fulfillmentHeight.action;

import alve.doors.ui.doorsDesigner.fulfillmentHeight.FulfillmentHeightView;
import com.vaadin.data.HasValue;

public class UpdateValidityOfFulfillmentHeightsAction implements HasValue.ValueChangeListener<String>{

    private final FulfillmentHeightView fulfillmentHeightView;

    public UpdateValidityOfFulfillmentHeightsAction(FulfillmentHeightView fulfillmentHeightView){
        this.fulfillmentHeightView = fulfillmentHeightView;
    }

    @Override
    public void valueChange(HasValue.ValueChangeEvent<String> valueChangeEvent) {
        fulfillmentHeightView.validate();
    }
}
