package alve.doors.ui.componentsList;

import alve.doors.ui.model.Wardrobe;
import com.vaadin.server.FileDownloader;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Button;

public class DownloadCuttingListAsPDFAction {

    private final Wardrobe wardrobe;
    private FileDownloader fileDownloader;

    public DownloadCuttingListAsPDFAction(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public void add(Button button){
        if(fileDownloader != null)
            fileDownloader.remove();

        fileDownloader = new FileDownloader(
                new FileResource(new PDFFileWithCuttingListCreator().create(wardrobe)));
        fileDownloader.extend(button);
    }
}
