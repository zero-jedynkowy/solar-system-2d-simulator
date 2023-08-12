public class Model 
{
    private static double SCALES[] = new double[]{0.2, 0.4, 0.6, 0.8, 1.0, 1.2, 1.4, 1.6, 1.8, 2.0};
    private static int currentScale = 4;
    private static double relativeMouseX = 0;
    private static double relativeMouseY = 0;

    public static double getCurrentScale()
    {
        return SCALES[currentScale];
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
