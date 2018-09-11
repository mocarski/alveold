package alve.doors.ui.componentsList;

import alve.doors.ui.model.Wardrobe;
import com.vaadin.server.BrowserWindowOpener;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Button;

public class OpenCuttingListAsPDFAction {
    private BrowserWindowOpener browserWindowOpener;
    private final Wardrobe wardrobe;

    public OpenCuttingListAsPDFAction(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public void add(Button button) {
        if (browserWindowOpener != null)
            browserWindowOpener.remove();

        browserWindowOpener = new BrowserWindowOpener(
                new FileResource(new PDFFileWithCuttingListCreator().create(wardrobe)));
        browserWindowOpener.extend(button);
    }
}
