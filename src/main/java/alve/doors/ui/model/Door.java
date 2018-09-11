package alve.doors.ui.model;

import alve.doors.ui.doorsDesigner.positioning.PositioningOption;
import alve.doors.ui.Constants;

import java.util.ArrayList;
import java.util.List;


public class Door
{
    private int width;
    private int height;
    private PositioningOption positioningOption = PositioningOption.None;

    // From top to bottom
    private List<Module> modules = new ArrayList<>();

    public Door(int width, int height)
    {
        this.width = width;
        this.height = height;

        //By default door is without HBars
        modules.add( new Module( calculateWidthOfModule(), calculateHeightOfModule( 1)) );
    }


    //Risky -> possibility to change width without changing wardrobe width
    public void setWidth( int width )
    {
        this.width = width;

        for(Module module : modules)
        {
            module.setWidth( calculateWidthOfModule() );
        }
    }


    public int getWidth()
    {
        return width;
    }


    public void setHeight(int height)
    {
        this.height = height;

        for(Module module : modules)
        {
            module.setHeight(calculateHeightOfModule( modules.size()));
        }
    }

    public int getHeight()
    {
        return height;
    }


    public void setAmountOfModules( int amountOfModules )
    {
        modules.clear();

        for( int i = 0; i < amountOfModules; i++ )
        {
            modules.add( new Module(calculateWidthOfModule(), calculateHeightOfModule( amountOfModules) ) );
        }
    }


    public int getAmountOfModules()
    {
        return modules.size();
    }

    public void setAmountOfDivision( int amountOfDivision)
    {
        setAmountOfModules( amountOfDivision + 1 );
    }

    public int getNumberOfDivisions()
    {
        return modules.size() > 0 ? modules.size()-1 : 0;
    }

    public List<Module> getModules()
    {
        return modules;
    }

    public PositioningOption getPositioningOption() {
        return positioningOption;
    }

    public void setPositioningOption(PositioningOption positioningOption) {
        this.positioningOption = positioningOption;
    }

    public int calculateTargetHeightOfModules(){
        return (height - (modules.size()-1)*Constants.HBAR_WIDTH - 2*Constants.HORIZONTAL_PROFILE_WIDTH)/modules.size()
                * modules.size();
    }

    private int calculateHeightOfModule( int amountOfModules) {
        return (height - (amountOfModules-1)*Constants.HBAR_WIDTH - 2*Constants
                .HORIZONTAL_PROFILE_WIDTH) / amountOfModules;
    }

    private int calculateWidthOfModule() {
        return width - 2*Constants.VERTICAL_PROFILE_WIDTH;
    }
}
