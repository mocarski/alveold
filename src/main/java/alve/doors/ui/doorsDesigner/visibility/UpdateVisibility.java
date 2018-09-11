package alve.doors.ui.doorsDesigner.visibility;

import alve.doors.ui.doorsDesigner.PreviewListButton;
import alve.doors.ui.doorsDesigner.referenceNameAndDoorFrameColour.ReferenceName;
import alve.doors.ui.doorsDesigner.cavityDimention.CavityDimentionView;
import alve.doors.ui.doorsDesigner.positioning.PositioningOptionsView;
import alve.doors.ui.doorsDesigner.numberOfDivisions.NumberOfDivisionsView;
import alve.doors.ui.doorsDesigner.fulfillmentHeight.FulfillmentHeightView;
import alve.doors.ui.doorsDesigner.fulfillmentType.FulfillmentTypeView;
import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.TrackFacioTrackCoverView;
import alve.doors.ui.doorsDesigner.visualization.VisualizationView;
import com.vaadin.data.HasValue;

public class UpdateVisibility implements HasValue.ValueChangeListener<String> {

    public UpdateVisibility(VisualizationView visualizationView, ReferenceName referenceName,
                            CavityDimentionView cavityDimentionView,
                            NumberOfDivisionsView
                                    numberOfDivisionsView,
                            FulfillmentHeightView fulfillmentHeightView, FulfillmentTypeView fulfillmentTypeView,
                            PositioningOptionsView positioningOptionsView, TrackFacioTrackCoverView
                                    trackFacioTrackCoverView,
                            PreviewListButton previewListButton) {
        this.visualizationView = visualizationView;
        this.referenceName = referenceName;
        this.cavityDimentionView = cavityDimentionView;
        this.numberOfDivisionsView = numberOfDivisionsView;
        this.fulfillmentHeightView = fulfillmentHeightView;
        this.fulfillmentTypeView = fulfillmentTypeView;
        this.positioningOptionsView = positioningOptionsView;
        this.trackFacioTrackCoverView = trackFacioTrackCoverView;
        this.previewListButton = previewListButton;
    }

    @Override
    public void valueChange(HasValue.ValueChangeEvent<String> valueChangeEvent) {

        if (referenceName.isValid() && cavityDimentionView.isValid()) {
            visualizationView.setVisible(true);
            numberOfDivisionsView.setVisible(true);

            if(numberOfDivisionsView.isValid()){
                fulfillmentHeightView.setVisible(true);

                if(fulfillmentHeightView.isValid())
                    setAllStepsAfterFulfillmentHeightVisible(true);
                else
                    setAllStepsAfterFulfillmentHeightVisible(false);
            }
            else
                setAllStepsAfterNumberOfDivisionsVisible(false);
        }
        else
            setAllStepsVisible(false);
    }

    private void setAllStepsVisible(boolean visible){
        visualizationView.setVisible(visible);
        numberOfDivisionsView.setVisible(visible);
        fulfillmentHeightView.setVisible(visible);
        fulfillmentTypeView.setVisible(visible);
        positioningOptionsView.setVisible(visible);
        trackFacioTrackCoverView.setVisible(visible);
        previewListButton.setEnabled(visible);
    }

    private void setAllStepsAfterNumberOfDivisionsVisible(boolean visible){
        fulfillmentHeightView.setVisible(visible);
        fulfillmentTypeView.setVisible(visible);
        positioningOptionsView.setVisible(visible);
        trackFacioTrackCoverView.setVisible(visible);
        previewListButton.setEnabled(visible);
    }

    private void setAllStepsAfterFulfillmentHeightVisible(boolean visible){
        fulfillmentTypeView.setVisible(visible);
        positioningOptionsView.setVisible(visible);
        trackFacioTrackCoverView.setVisible(visible);
        previewListButton.setEnabled(visible);
    }

    private final VisualizationView visualizationView;
    private final ReferenceName referenceName;
    private final CavityDimentionView cavityDimentionView;
    private final NumberOfDivisionsView numberOfDivisionsView;
    private final FulfillmentHeightView fulfillmentHeightView;
    private final FulfillmentTypeView fulfillmentTypeView;
    private final PositioningOptionsView positioningOptionsView;
    private final TrackFacioTrackCoverView trackFacioTrackCoverView;
    private final PreviewListButton previewListButton;
}
