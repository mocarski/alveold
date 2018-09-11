package alve.doors.ui.doorsDesigner.visualization.action;

import alve.doors.ui.doorsDesigner.fulfillmentHeight.FulfillmentHeightView;
import alve.doors.ui.doorsDesigner.visualization.VisualizationView;
import com.vaadin.data.HasValue;

public class UpdateVisualizationWhenCorrectModuleHeights implements HasValue.ValueChangeListener<String> {
    private final VisualizationView visualizationView;
    private final FulfillmentHeightView fulfillmentHeightView;


    public UpdateVisualizationWhenCorrectModuleHeights(VisualizationView visualizationView,
                                                       FulfillmentHeightView fulfillmentHeightView)
    {
        this.visualizationView = visualizationView;
        this.fulfillmentHeightView = fulfillmentHeightView;
    }


    @Override
    public void valueChange( HasValue.ValueChangeEvent<String> valueChangeEvent )
    {
        if(fulfillmentHeightView.isValid()){
            visualizationView.updateView();
        }
    }
}
