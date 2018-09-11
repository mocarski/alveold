package alve.doors.ui.doorsDesigner.positioning.action;

import alve.doors.ui.doorsDesigner.positioning.PositioningOptionsView;
import com.vaadin.data.HasValue;

public class UpdatePositioningOptionsAction implements HasValue.ValueChangeListener<String>{

    private final PositioningOptionsView positioningOptionsView;

    public UpdatePositioningOptionsAction(PositioningOptionsView positioningOptionsView) {
        this.positioningOptionsView = positioningOptionsView;
    }

    @Override
    public void valueChange(HasValue.ValueChangeEvent<String> valueChangeEvent) {
        positioningOptionsView.updateAvailablePositioningOptions();
    }
}
