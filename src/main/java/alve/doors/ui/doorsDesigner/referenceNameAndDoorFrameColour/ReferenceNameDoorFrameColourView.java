package alve.doors.ui.doorsDesigner.referenceNameAndDoorFrameColour;

import com.vaadin.ui.FormLayout;

public class ReferenceNameDoorFrameColourView extends FormLayout {

    public ReferenceNameDoorFrameColourView(ReferenceName referenceName, DoorFrameColourSelect
            doorFrameColourSelect) {
        addComponents(referenceName, doorFrameColourSelect);

        setSizeUndefined();
        setMargin(false);
        setStyleName("MarginTopAndBottom");
    }
}
