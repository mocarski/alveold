package alve.doors.ui;

public class Constants
{
    //Doors form view
    public static final String HEIGHT = "Height";
    public static final String WIDTH = "Width";
    public static final String REFERENCE_NAME = "Reference name";
    public static final String DOOR_FRAME_COLOUR = "Door frame colour";
    public static final String DIVIDERS_AMOUNT = "Dividers amount";
    public static final String NUMBER_OF_DOORS = "Number of doors";
    public static final String NUMBER_OF_DIVISIONS = "Number of divisions:";
    public static final String HEIGHT_OF_FILLINGS = "Height of fillings:";
    public static final String HEIGHT_OF_FILLING = "Height of filling";
    public static final String TYPE_OF_FILLINGS = "Type od fillings:";
    public static final String ACCESSORIES = "Accessories:";
    public static final String CAVITY_DIMENTIONS = "Cavity dimentions:";
    public static final String PREVIEW_PRODUCTION_LIST = "Preview production list";
    public static final String BOTTOM_TRUCK_COVER = "Bottom track cover";
    public static final String TOP_TRACK_FACIO = "Top Track Facio";
    public static final String WHITE = "White";
    public static final String SILVER = "Silver";

    //Validation
    public static final String REFERENCE_NAME_IS_REQUIRED = "Reference name is required";


    //Dimensions
    public static final int VERTICAL_PROFILE_WIDTH = 71;
    public static final int PLACE_TO_FILL_FULFILLMENT = 9;
    public static final int HORIZONTAL_PROFILE_WIDTH = 60;
    public static final int HBAR_WIDTH = 61;
    public static final int PLACE_FOR_TOP_WHEEL = 51;
    public static final int PLACE_FOR_BOTTOM_WHEEL = 146;
    public static final int PLACE_FOR_DIVIDING_PROFILE = 32;
    private static final int PLACE_BETWEEN_FLOOR_AND_DOORS = 17;
    private static final int PLACE_BETWEEN_CEILING_AND_DOORS = 34;
    public static final int SILICONE_BUFFERING_THICKNESS = 1;

    public static final int DOORS_LOWER_THEN_CAVITY = PLACE_BETWEEN_FLOOR_AND_DOORS + PLACE_BETWEEN_CEILING_AND_DOORS;
    public static final int DOORS_NARROWER_THEN_CAVITY = 2 * SILICONE_BUFFERING_THICKNESS;
    public static final int SPACE = 2;
    public static final int PLACE_FOR_TOP_WHEEL_CONFLICTED_WITH_MODULE = PLACE_FOR_TOP_WHEEL - HORIZONTAL_PROFILE_WIDTH;
    public static final int PLACE_FOR_BOTTOM_WHEEL_CONFLICTED_WITH_MODULE = PLACE_FOR_BOTTOM_WHEEL -
            HORIZONTAL_PROFILE_WIDTH;
    public static final int PLACE_FOR_RIGID_BAR_INTRUDING_HBAR = (HBAR_WIDTH - PLACE_FOR_DIVIDING_PROFILE)/2;

    public static final String PVC_DIMENSION = "300";
    public static final String _3MM_16MM = "3x16";
    public static final String _3MM_25MM = "3x25";
    public static final String MM = "mm";

}
