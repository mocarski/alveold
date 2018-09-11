package alve.doors.ui.doorsDesigner.trackFacioAndTrackCover;

import com.vaadin.ui.FormLayout;

public class TrackFacioTrackCoverView extends FormLayout {

    public TrackFacioTrackCoverView(TopTrackFacioSelect topTrackFacioSelect, BottomTrackCoverSelect bottomTrackCoverSelect) {
        addComponents(topTrackFacioSelect, bottomTrackCoverSelect);

        setSizeUndefined();
        setMargin(false);
        setVisible(false);
    }
}
