package alve.doors.ui.componentsList.table.tableItemFactory;

import alve.doors.ui.doorsDesigner.referenceNameAndDoorFrameColour.DoorFrameColour;

public enum Product {

    ALUMINIUM_DOUBLE_BOTTOM_TRACK("Aluminium Double Bottom Track (Silver)","TD00..."),
    ALUMINIUM_TRACK_COVER("Aluminium Track Cover (Silver)","ZT00..."),
    RIGID_BAR_TT_4_MM_FILLINGS("Rigid Bar TT – 4mm fillings","TT1504"),
    RIGID_BAR_TT_8_MM_FILLINGS("Rigid Bar TT – 8mm fillings","TT1508"),
    BABY_RIGID_BAR_4_MM_FILLINGS("Baby Rigid Bar – 4mm fillings","BRB-04"),
    BABY_RIGID_BAR_8_MM_FILLINGS("Baby Rigid Bar – 8mm fillings","BRB-08"),
    DIVIDING_PROFILE_HOOKUP_FITTING("Dividing Profile Hook-up Fitting","OLP"),
    GLASS_4MM("Safety Backed 4mm Glass",""),
    BOARD_8MM("Board 8mm",""),
    BOTTOM_WHEELED_CONNECTOR_RIGHT("Bottom Wheeled Connector Right","WDP"),
    BOTTOM_WHEELED_CONNECTOR_LEFT ("Bottom Wheeled Connector Left","WDL"),
    TOP_WHEELED_CONNECTOR_LEFT("Top Wheeled Connector Left","WGL"),
    TOP_WHEELED_CONNECTOR_RIGHT("Top Wheeled Connector Right","WGP"),
    STEEL_DOUBLE_TOP_TRACK("Steel Double Top Track","TG005"),
    TOP_TRACK_DOOR_POSITIONER("Top Track Door Positioner","PTG01"),
    SOFT_CLOSE_DUMPER("Soft Close Dumper 25-35kg","SF001"),
    SOFT_CLOSE_DUMPER_ACTIVATOR("Soft Close Dumper Activator",""),
    PVC("PVC Edging (2mm)",""),
    SILICON_BUFFERING_DROPS("Silicon Buffering Drops","OC127"),
    SELF_TAPPING_WOOD_SCREW_3MM_16MM("Self Tapping Wood Screw","WM316"),
    SELF_TAPPING_WOOD_SCREW_3MM_25MM("Self Tapping Wood Screw","WM325"),

    VERTICAL_PROFILE_LEFT_light_oak("Vertical Profile Left (Light Oak)","LEV67"),
    VERTICAL_PROFILE_LEFT_winchester_oak("Vertical Profile Left (Winchester Oak)","LEV72"),
    VERTICAL_PROFILE_LEFT_syferian_oak("Vertical Profile Left (Syberian Oak)","LEV79"),
    VERTICAL_PROFILE_LEFT_tabacco_walnut("Vertical Profile Left (Tobacco Walnut)","LEV04"),
    VERTICAL_PROFILE_LEFT_mocca_oak("Vertical Profile Left (Mocca Oak)","LEV07"),
    VERTICAL_PROFILE_LEFT_africa_ebony("Vertical Profile Left (Africa Ebony)","LEV08"),

    VERTICAL_PROFILE_RIGHT_light_oak("Vertical Profile Right (Light Oak)","REV67"),
    VERTICAL_PROFILE_RIGHT_winchester_oak("Vertical Profile Right (Winchester Oak)","REV72"),
    VERTICAL_PROFILE_RIGHT_syferian_oak("Vertical Profile Right (Syberian Oak)","REV79"),
    VERTICAL_PROFILE_RIGHT_tabacco_walnut("Vertical Profile Right (Tobacco Walnut)","REV04"),
    VERTICAL_PROFILE_RIGHT_mocca_oak("Vertical Profile Right (Mocca Oak)","REV07"),
    VERTICAL_PROFILE_RIGHT_africa_ebony("Vertical Profile Right (Africa Ebony)","REV08"),

    TOP_TRACK_FACIO_light_oak("Top Track Facio (Light Oak)","MV67"),
    TOP_TRACK_FACIO_winchester_oak("Top Track Facio (Winchester Oak)","MV72"),
    TOP_TRACK_FACIO_syferian_oak("Top Track Facio (Syberian Oak)","MV79"),
    TOP_TRACK_FACIO_tabacco_walnut("Top Track Facio (Tobacco Walnut)","MV04"),
    TOP_TRACK_FACIO_mocca_oak("Top Track Facio (Mocca Oak)","MV07"),
    TOP_TRACK_FACIO_africa_ebony("Top Track Facio (Africa Ebony)","MV08"),
    TOP_TRACK_FACIO_white("Top Track Facio (White)","MV00"),

    VENEERED_SELF_ADHESIVE_TAPE_light_oak("Veneered Self-Adhesive Tape (Light Oak)","TF67"),
    VENEERED_SELF_ADHESIVE_TAPE_winchester_oak("Veneered Self-Adhesive Tape (Winchester Oak)","TF72"),
    VENEERED_SELF_ADHESIVE_TAPE_syferian_oak("Veneered Self-Adhesive Tape (Syberian Oak)","TF79"),
    VENEERED_SELF_ADHESIVE_TAPE_tabacco_walnut("Veneered Self-Adhesive Tape (Tobacco Walnut)","TF04"),
    VENEERED_SELF_ADHESIVE_TAPE_mocca_oak("Veneered Self-Adhesive Tape (Mocca Oak)","TF07"),
    VENEERED_SELF_ADHESIVE_TAPE_africa_ebony("Veneered Self-Adhesive Tape (Africa Ebony)","TF08"),

    HORIZONTAL_PROFILE_TOP_BOTTOM_light_oak("Horizontal Profile Top/Bottom (Light Oak)","PV67"),
    HORIZONTAL_PROFILE_TOP_BOTTOM_winchester_oak("Horizontal Profile Top/Bottom (Winchester Oak)","PV72"),
    HORIZONTAL_PROFILE_TOP_BOTTOM_syferian_oak("Horizontal Profile Top/Bottom (Syberian Oak)","PV79"),
    HORIZONTAL_PROFILE_TOP_BOTTOM_tabacco_walnut("Horizontal Profile Top/Bottom (Tobacco Walnut)","PV04"),
    HORIZONTAL_PROFILE_TOP_BOTTOM_mocca_oak("Horizontal Profile Top/Bottom (Mocca Oak)","PV07"),
    HORIZONTAL_PROFILE_TOP_BOTTOM_africa_ebony("Horizontal Profile Top/Bottom (Africa Ebony)","PV08"),

    H_BAR_light_oak("H Bar (Light Oak)","HV67"),
    H_BAR_winchester_oak("H Bar (Winchester Oak)","HV72"),
    H_BAR_syferian_oak("H Bar (Syberian Oak)","HV79"),
    H_BAR_tabacco_walnut("H Bar (Tobacco Walnut)","HV04"),
    H_BAR_mocca_oak("H Bar (Mocca Oak)","HV07"),
    H_BAR_africa_ebony("H Bar (Africa Ebony)","HV08");


    public static Product getHBar(DoorFrameColour colour) {
        if(colour.equals(DoorFrameColour.LightOak))
            return H_BAR_light_oak;
        if(colour.equals(DoorFrameColour.WinchesterOak))
            return H_BAR_winchester_oak;
        if(colour.equals(DoorFrameColour.SyberianOak))
            return H_BAR_syferian_oak;
        if(colour.equals(DoorFrameColour.TobaccoWalnut))
            return H_BAR_tabacco_walnut;
        if(colour.equals(DoorFrameColour.MoccaOak))
            return H_BAR_mocca_oak;

        return H_BAR_africa_ebony;
    }

    public static Product getHorizontalProfile(DoorFrameColour colour) {
        if(colour.equals(DoorFrameColour.LightOak))
            return HORIZONTAL_PROFILE_TOP_BOTTOM_light_oak;
        if(colour.equals(DoorFrameColour.WinchesterOak))
            return HORIZONTAL_PROFILE_TOP_BOTTOM_winchester_oak;
        if(colour.equals(DoorFrameColour.SyberianOak))
            return HORIZONTAL_PROFILE_TOP_BOTTOM_syferian_oak;
        if(colour.equals(DoorFrameColour.TobaccoWalnut))
            return HORIZONTAL_PROFILE_TOP_BOTTOM_tabacco_walnut;
        if(colour.equals(DoorFrameColour.MoccaOak))
            return HORIZONTAL_PROFILE_TOP_BOTTOM_mocca_oak;

        return HORIZONTAL_PROFILE_TOP_BOTTOM_africa_ebony;
    }

    public static Product getVeeneredSelfAdhesiveTape(DoorFrameColour colour) {
        if(colour.equals(DoorFrameColour.LightOak))
            return VENEERED_SELF_ADHESIVE_TAPE_light_oak;
        if(colour.equals(DoorFrameColour.WinchesterOak))
            return VENEERED_SELF_ADHESIVE_TAPE_winchester_oak;
        if(colour.equals(DoorFrameColour.SyberianOak))
            return VENEERED_SELF_ADHESIVE_TAPE_syferian_oak;
        if(colour.equals(DoorFrameColour.TobaccoWalnut))
            return VENEERED_SELF_ADHESIVE_TAPE_tabacco_walnut;
        if(colour.equals(DoorFrameColour.MoccaOak))
            return VENEERED_SELF_ADHESIVE_TAPE_mocca_oak;

        return VENEERED_SELF_ADHESIVE_TAPE_africa_ebony;
    }

    public static Product getTopTrackFacio(String colour) {
        if(colour.equals(DoorFrameColour.LightOak))
            return TOP_TRACK_FACIO_light_oak;
        if(colour.equals(DoorFrameColour.WinchesterOak))
            return TOP_TRACK_FACIO_winchester_oak;
        if(colour.equals(DoorFrameColour.SyberianOak))
            return TOP_TRACK_FACIO_syferian_oak;
        if(colour.equals(DoorFrameColour.TobaccoWalnut))
            return TOP_TRACK_FACIO_tabacco_walnut;
        if(colour.equals(DoorFrameColour.MoccaOak))
            return TOP_TRACK_FACIO_mocca_oak;
        if(colour.equals(DoorFrameColour.AfricaEbony))
            return TOP_TRACK_FACIO_africa_ebony;

        return TOP_TRACK_FACIO_white;
    }

    public static Product getVerticalProfileRight(DoorFrameColour colour) {
        if(colour.equals(DoorFrameColour.LightOak))
            return VERTICAL_PROFILE_RIGHT_light_oak;
        if(colour.equals(DoorFrameColour.WinchesterOak))
            return VERTICAL_PROFILE_RIGHT_winchester_oak;
        if(colour.equals(DoorFrameColour.SyberianOak))
            return VERTICAL_PROFILE_RIGHT_syferian_oak;
        if(colour.equals(DoorFrameColour.TobaccoWalnut))
            return VERTICAL_PROFILE_RIGHT_tabacco_walnut;
        if(colour.equals(DoorFrameColour.MoccaOak))
            return VERTICAL_PROFILE_RIGHT_mocca_oak;

        return VERTICAL_PROFILE_RIGHT_africa_ebony;
    }

    public static Product getVerticalProfileLeft(DoorFrameColour colour){
        if(colour.equals(DoorFrameColour.LightOak))
            return VERTICAL_PROFILE_LEFT_light_oak;
        if(colour.equals(DoorFrameColour.WinchesterOak))
            return VERTICAL_PROFILE_LEFT_winchester_oak;
        if(colour.equals(DoorFrameColour.SyberianOak))
            return VERTICAL_PROFILE_LEFT_syferian_oak;
        if(colour.equals(DoorFrameColour.TobaccoWalnut))
            return VERTICAL_PROFILE_LEFT_tabacco_walnut;
        if(colour.equals(DoorFrameColour.MoccaOak))
            return VERTICAL_PROFILE_LEFT_mocca_oak;

        return VERTICAL_PROFILE_LEFT_africa_ebony;
    }

    private String name;
    private String itemCode;

    Product(String name, String itemCode){
        this.name = name;
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return itemCode;
    }
    public String getName() {
        return name;
    }
}
