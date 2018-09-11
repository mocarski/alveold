package alve.doors.ui.doorsDesigner.referenceNameAndDoorFrameColour;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.Constants;
import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.action.UpdateAvailableColorsAction;
import com.vaadin.data.Binder;
import com.vaadin.ui.NativeSelect;

public class DoorFrameColourSelect extends NativeSelect<String> {

    public DoorFrameColourSelect(Wardrobe wardrobe) {
        setCaption(Constants.DOOR_FRAME_COLOUR);
        setWidth( "10%" );
        setEmptySelectionAllowed( false );
        setItems( DoorFrameColour.getDoorFrameColours() );

        bind(wardrobe);
    }

    public void bind(Wardrobe wardrobe){
        Binder<Wardrobe> binder = new Binder<>();

        binder.forField( this )
                .bind( Wardrobe::getColour, Wardrobe::setColour);

        binder.setBean(wardrobe);
    }

    public void setActions(UpdateAvailableColorsAction updateAvailableColorsAction) {
        addValueChangeListener(updateAvailableColorsAction);
    }
}
