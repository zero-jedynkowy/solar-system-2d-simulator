public class Model 
{
    private static double SCALES[] = new double[]{0.2, 0.4, 0.6, 0.8, 1.0, 1.2, 1.4, 1.6, 1.8, 2.0};
    private static int currentScale = 4;
    private static double relativeMouseX = 0; // RELATIVE TO THE LEFT CORNER OF THE PROGRAMME
    private static double relativeMouseY = 0; // RELATIVE TO THE LEFT CORNER OF THE PROGRAMME
    private static double chartMouseX = 0; // RELATIVE TO THE CENTER OF THE SYSTEM
    private static double chartMouseY = 0; // RELATIVE TO THE CENTER OF THE SYSTEM
    private static double defaultUnit = 50; 
    private static int relativeCenterX = 0; // RELATIVE TO THE LEFT CORNER OF THE PROGRAMME
    private static int relativeCenterY = 0; // RELATIVE TO THE LEFT CORNER OF THE PROGRAMME

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

    public static void setRelativeMouseX(double newValue)
    {
        relativeMouseX = newValue;
    }

    public static void setRelativeMouseY(double newValue)
    {
        relativeMouseY = newValue;
    }

    public static double getRelativeMouseX()
    {
        return relativeMouseX;
    }

    public static double getRelativeMouseY()
    {
        return relativeMouseY;
    }
}
