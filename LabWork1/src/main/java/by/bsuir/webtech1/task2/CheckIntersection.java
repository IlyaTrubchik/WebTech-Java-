package by.bsuir.webtech1.task2;

public class CheckIntersection {
    private static int lowerY = -3;
    private static int upperY = 5;

    private static int middleY = 0;
    private static int wideRangeLeftX = -6;
    private static int wideRangeRightX = 6;
    private static int shortRangeLeftX = -4;
    private static int shortRangeRightX = 4;


    public static boolean checkPoint(double x,double y)
    {
        if(x<=wideRangeRightX && x>=wideRangeLeftX && y>=lowerY && y<=upperY)
        {
            if(y<=middleY)
            {
                return true;
            }
            else if(x>=shortRangeLeftX && x<=wideRangeRightX)
            {
                return  true;
            }
        }
        return  false;
    }
}
