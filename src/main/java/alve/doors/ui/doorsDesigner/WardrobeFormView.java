package alve.doors.ui.doorsDesigner;

import alve.doors.ui.doorsDesigner.positioning.PositioningOptionsView;
import alve.doors.ui.doorsDesigner.numberOfDivisions.NumberOfDivisionsView;
import alve.doors.ui.doorsDesigner.fulfillmentHeight.FulfillmentHeightView;
import alve.doors.ui.doorsDesigner.fulfillmentType.FulfillmentTypeView;
import alve.doors.ui.doorsDesigner.cavityDimention.CavityDimentionView;
import alve.doors.ui.doorsDesigner.referenceNameAndDoorFrameColour.ReferenceNameDoorFrameColourView;
import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.TrackFacioTrackCoverView;
import alve.doors.ui.doorsDesigner.visualization.VisualizationView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;


public class WardrobeFormView extends VerticalLayout implements View {

    public WardrobeFormView(VisualizationView visualizationView,
                            ReferenceNameDoorFrameColourView referenceNameDoorFrameColourView,
                            CavityDimentionView cavityDimentionView,
                            NumberOfDivisionsView numberOfDivisionsView,
                            FulfillmentHeightView fulfillmentHeightView,
                            FulfillmentTypeView fulfillmentTypeView,
                            PositioningOptionsView positioningOptionsView,
                            TrackFacioTrackCoverView topTrackFacioSelect,
                            Button previewListButton) {
        addComponents(visualizationView, referenceNameDoorFrameColourView, cavityDimentionView,
                numberOfDivisionsView, fulfillmentHeightView, fulfillmentTypeView, positioningOptionsView,
                topTrackFacioSelect, previewListButton);
        setComponentAlignment(visualizationView, Alignment.MIDDLE_CENTER);
        setComponentAlignment(referenceNameDoorFrameColourView, Alignment.MIDDLE_CENTER);
        setComponentAlignment(cavityDimentionView, Alignment.MIDDLE_CENTER);
        setComponentAlignment(numberOfDivisionsView, Alignment.MIDDLE_CENTER);
        setComponentAlignment(fulfillmentHeightView, Alignment.MIDDLE_CENTER);
        setComponentAlignment(fulfillmentTypeView, Alignment.MIDDLE_CENTER);
        setComponentAlignment(positioningOptionsView, Alignment.MIDDLE_CENTER);
        setComponentAlignment(topTrackFacioSelect, Alignment.MIDDLE_CENTER);
        setComponentAlignment(previewListButton, Alignment.MIDDLE_CENTER);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
    }
}
