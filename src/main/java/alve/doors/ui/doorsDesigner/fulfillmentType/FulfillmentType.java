package alve.doors.ui.doorsDesigner.fulfillmentType;


public enum FulfillmentType {
    GLASS("4mm(Glass)"),
    BOARD("8mm(Board)");

    String type;

    FulfillmentType(String type) {
        this.type = type;
    }
}
