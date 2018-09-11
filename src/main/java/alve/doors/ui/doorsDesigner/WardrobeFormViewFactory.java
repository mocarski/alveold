package alve.doors.ui.doorsDesigner;


import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.navigation.action.GoToComponentsListAction;
import alve.doors.ui.Constants;
import alve.doors.ui.doorsDesigner.positioning.PositioningOptionsView;
import alve.doors.ui.doorsDesigner.referenceNameAndDoorFrameColour.DoorFrameColourSelect;
import alve.doors.ui.doorsDesigner.referenceNameAndDoorFrameColour.ReferenceName;
import alve.doors.ui.doorsDesigner.referenceNameAndDoorFrameColour.ReferenceNameDoorFrameColourView;
import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.BottomTrackCoverSelect;
import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.TopTrackFacioSelect;
import alve.doors.ui.doorsDesigner.positioning.action.CreatePositioningOptionsAction;
import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.TrackFacioTrackCoverView;
import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.action.UpdateAvailableColorsAction;
import alve.doors.ui.doorsDesigner.cavityDimention.CavityDimentionView;
import alve.doors.ui.doorsDesigner.cavityDimention.CavityHeight;
import alve.doors.ui.doorsDesigner.cavityDimention.CavityWidth;
import alve.doors.ui.doorsDesigner.cavityDimention.NumberOfDoors;
import alve.doors.ui.doorsDesigner.fulfillmentHeight.FulfillmentHeightView;
import alve.doors.ui.doorsDesigner.fulfillmentHeight.action.UpdateFulfillmentHeightTextFieldsAction;
import alve.doors.ui.doorsDesigner.fulfillmentHeight.action.UpdateValidityOfFulfillmentHeightsAction;
import alve.doors.ui.doorsDesigner.fulfillmentType.FulfillmentTypeView;
import alve.doors.ui.doorsDesigner.fulfillmentType.action.CreateFulfillmentTypeSelectAction;
import alve.doors.ui.doorsDesigner.numberOfDivisions.NumberOfDivisionsView;
import alve.doors.ui.doorsDesigner.numberOfDivisions.action.CreateNumberOfDivisionFieldsAction;
import alve.doors.ui.doorsDesigner.positioning.action.UpdatePositioningOptionsAction;
import alve.doors.ui.doorsDesigner.visibility.UpdateVisibility;
import alve.doors.ui.doorsDesigner.visualization.VisualizationView;
import alve.doors.ui.doorsDesigner.visualization.action.UpdateVisualization;
import alve.doors.ui.doorsDesigner.visualization.action.UpdateVisualizationWhenCorrectModuleHeights;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;

public class WardrobeFormViewFactory {
    public static WardrobeFormView create(Navigator navigator, Wardrobe wardrobe) {
        VisualizationView visualizationView = new VisualizationView(wardrobe);

        ReferenceName referenceName = new ReferenceName(wardrobe);
        DoorFrameColourSelect doorFrameColourSelect = new DoorFrameColourSelect(wardrobe);
        ReferenceNameDoorFrameColourView referenceNameDoorFrameColourView = new
                ReferenceNameDoorFrameColourView(referenceName, doorFrameColourSelect);

        FormLayout formLayout = new FormLayout();
        formLayout.setSizeUndefined();
        formLayout.setMargin(false);
        CavityHeight cavityHeight = new CavityHeight(wardrobe);
        CavityWidth cavityWidth = new CavityWidth(wardrobe);
        NumberOfDoors numberOfDoors = new NumberOfDoors(wardrobe);

        CavityDimentionView cavityDimentionView = new CavityDimentionView( new Label(Constants
                .CAVITY_DIMENTIONS), formLayout, cavityHeight, cavityWidth, numberOfDoors);
        NumberOfDivisionsView numberOfDivisionsView = new NumberOfDivisionsView(wardrobe);
        FulfillmentHeightView fulfillmentHeightView = new FulfillmentHeightView(wardrobe);
        FulfillmentTypeView fulfillmentTypeView = new FulfillmentTypeView(wardrobe);

        PositioningOptionsView positioningOptionsView = new PositioningOptionsView(wardrobe);
        TopTrackFacioSelect topTrackFacioSelect = new TopTrackFacioSelect(wardrobe);
        BottomTrackCoverSelect bottomTrackCoverSelect = new BottomTrackCoverSelect(wardrobe);
        TrackFacioTrackCoverView trackFacioTrackCoverView = new TrackFacioTrackCoverView
                (topTrackFacioSelect, bottomTrackCoverSelect);

        PreviewListButton previewListButton = new PreviewListButton(new GoToComponentsListAction(navigator));

        //Create actions
        CreateFulfillmentTypeSelectAction createFulfillmentTypeSelectAction = new CreateFulfillmentTypeSelectAction(fulfillmentTypeView);
        UpdateVisualization updateVisualization = new UpdateVisualization(visualizationView);
        UpdateVisualizationWhenCorrectModuleHeights updateVisualizationWhenCorrectModuleHeights = new
                UpdateVisualizationWhenCorrectModuleHeights(visualizationView, fulfillmentHeightView);
        UpdateFulfillmentHeightTextFieldsAction updateFulfillmentHeightTextFieldsAction = new UpdateFulfillmentHeightTextFieldsAction
                (fulfillmentHeightView);
        UpdateValidityOfFulfillmentHeightsAction updateValidityOfFulfillmentHeightsAction = new UpdateValidityOfFulfillmentHeightsAction
                (fulfillmentHeightView);
        UpdateAvailableColorsAction updateAvailableColorsAction = new UpdateAvailableColorsAction
                (topTrackFacioSelect, bottomTrackCoverSelect);
        UpdateVisibility updateVisibility = new UpdateVisibility(visualizationView, referenceName,
                cavityDimentionView, numberOfDivisionsView, fulfillmentHeightView,
                fulfillmentTypeView, positioningOptionsView, trackFacioTrackCoverView, previewListButton );
        CreatePositioningOptionsAction createPositioningOptionsAction = new CreatePositioningOptionsAction
                (positioningOptionsView);
        UpdatePositioningOptionsAction updatePositioningOptionsAction = new UpdatePositioningOptionsAction
                (positioningOptionsView);

        //Set actions
        referenceName.setActions(updateVisibility);
        doorFrameColourSelect.setActions(updateAvailableColorsAction);

        cavityHeight.setActions( updateVisibility, updateVisualization, updateFulfillmentHeightTextFieldsAction);

        cavityWidth.setActions(updateVisibility, updateVisualization, updatePositioningOptionsAction);

        numberOfDoors.setActions(updateVisibility, updateVisualization, new CreateNumberOfDivisionFieldsAction
                        (numberOfDivisionsView), createFulfillmentTypeSelectAction,
                createPositioningOptionsAction);

        numberOfDivisionsView.setActions(updateVisibility, createFulfillmentTypeSelectAction,
                updateFulfillmentHeightTextFieldsAction, updateVisualization);

        fulfillmentHeightView.setActions(updateVisualizationWhenCorrectModuleHeights,
                updateVisibility, updateValidityOfFulfillmentHeightsAction);


        WardrobeFormView wardrobeFormView = new WardrobeFormView(visualizationView,
                referenceNameDoorFrameColourView,
                cavityDimentionView, numberOfDivisionsView, fulfillmentHeightView, fulfillmentTypeView,
                positioningOptionsView,trackFacioTrackCoverView, previewListButton);

        return wardrobeFormView;
    }
}
