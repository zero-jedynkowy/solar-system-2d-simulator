package solar_system;
public class Model 
{
    private static double SCALES[] = new double[]{0.2, 0.4, 0.6, 0.8, 1.0, 1.2, 1.4, 1.6, 1.8, 2.0};
    private static int currentScale = 4;
    
    public static void setNextScale()
    {
        currentScale++;
        if(currentScale > SCALES.length) currentScale = SCALES.length - 1;
    }

    public static void setPrevScale()
    {
        currentScale--;
        if(currentScale < 0) currentScale = 0;
    }

    public static double getCurrentScale()
    {
        return SCALES[currentScale];
    }
}
