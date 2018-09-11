package alve.doors.ui.doorsDesigner.trackFacioAndTrackCover;

import alve.doors.ui.model.Wardrobe;
import alve.doors.ui.Constants;
import com.vaadin.data.Binder;
import com.vaadin.ui.NativeSelect;

public class BottomTrackCoverSelect extends NativeSelect<String>{

    private final Wardrobe wardrobe;

    public BottomTrackCoverSelect(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
        setCaption(Constants.BOTTOM_TRUCK_COVER);
        setWidth("10%");
        setEmptySelectionAllowed(false);

        bind();
        updateAvailableColours();
    }

    private void bind() {
        Binder<Wardrobe> binder = new Binder<>();

        binder.forField( this )
                .bind( Wardrobe::getBottomTrackCover, Wardrobe::setBottomTruckCover );

        binder.setBean(wardrobe);
    }

    public void updateAvailableColours(){
        setItems(wardrobe.getColour(), Constants.SILVER);
    }
}
