package alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.action;

import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.BottomTrackCoverSelect;
import alve.doors.ui.doorsDesigner.trackFacioAndTrackCover.TopTrackFacioSelect;
import com.vaadin.data.HasValue;

public class UpdateAvailableColorsAction implements HasValue.ValueChangeListener<String> {

    private final TopTrackFacioSelect topTrackFacioSelect;
    private final BottomTrackCoverSelect bottomTrackCoverSelect;

    public UpdateAvailableColorsAction(TopTrackFacioSelect topTrackFacioSelect, BottomTrackCoverSelect bottomTrackCoverSelect){
        this.topTrackFacioSelect = topTrackFacioSelect;
        this.bottomTrackCoverSelect = bottomTrackCoverSelect;
    }

    @Override
    public void valueChange(HasValue.ValueChangeEvent<String> valueChangeEvent) {
        topTrackFacioSelect.updateAvailableColours();
        bottomTrackCoverSelect.updateAvailableColours();
    }
}
