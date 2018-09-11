package alve.doors.ui.model;

import alve.doors.ui.doorsDesigner.fulfillmentType.FulfillmentType;

public class Module {
    private int width;
    private int height;
    private FulfillmentType fulfillmentType = FulfillmentType.GLASS;

    public Module(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getWidth() {
        return width;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public int getHeight() {
        return height;
    }

    public void setFulfillmentType(FulfillmentType fulfillmentType) {
        this.fulfillmentType = fulfillmentType;
    }

    public FulfillmentType getFulfillmentType()
    {
        return fulfillmentType;
    }
}

