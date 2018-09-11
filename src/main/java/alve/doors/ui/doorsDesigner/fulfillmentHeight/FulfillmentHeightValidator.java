package alve.doors.ui.doorsDesigner.fulfillmentHeight;

import alve.doors.ui.model.Module;
import alve.doors.ui.model.Door;
import com.vaadin.data.ValidationResult;
import com.vaadin.data.Validator;
import com.vaadin.data.ValueContext;

public class FulfillmentHeightValidator implements Validator<Integer> {

    private final Door door;
    private final Module module;

    public FulfillmentHeightValidator(Door door, Module module){
        this.door = door;
        this.module = module;
    }

    @Override
    public ValidationResult apply(Integer integer, ValueContext valueContext) {
        if(integer == countCorrectHeightOfModule())
            return ValidationResult.ok();

        /*Dispite of error as validation result, model has to be updated to give
        possibility to change other module heights*/
        module.setHeight(integer);

        return ValidationResult.error(prepareErrorMessage());
    }

    private String prepareErrorMessage() {
        if(countCorrectHeightOfModule() <= 0){
            return String.format("%s %d. %s.", "Summary height of fillings must be equal to" ,
                    door.calculateTargetHeightOfModules(),
                    "Change heights of rest fillings to achieve this goal");
        }
        return String.format("%s %d. %s %d %s.", "Summary height of fillings must be equal to" ,
                door.calculateTargetHeightOfModules(), "Enter", countCorrectHeightOfModule(),
                "to achieve this goal");
    }

    private int countCorrectHeightOfModule() {
        int summaryOfRestModules = 0;
        for(Module doorModule : door.getModules()){
            if(!doorModule.equals(module))
                summaryOfRestModules += doorModule.getHeight();
        }

        return door.calculateTargetHeightOfModules() - summaryOfRestModules;
    }
}
