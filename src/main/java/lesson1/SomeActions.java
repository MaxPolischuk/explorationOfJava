package lesson1;

import java.util.Arrays;

public class SomeActions {

    public static final int SECONDS_IN_MINUTE = 60;
    public static final int SECONDS_IN_HOUR = 3600;

    public static void main(String[] args) {
        System.out.println("Total deposit after 3 years:"+countComplexPercent(2513,11.2));
        System.out.println("Second degree is:"+countSecondDegree(52));
        System.out.println("Discriminant is:"+countDiscriminant(3,15,7));
        System.out.println("Roots are:"+ Arrays.toString(rootCounting(3,15,7)));
        System.out.println("X1*X2="+rootMultiplication(3,15,7));
        System.out.println("Total length:"+countLengthOld(15,3,11));
        System.out.println("Time from begining of a day:"+countTimeFromBegining(9,53,41));
        System.out.println("Degrees to radians:"+countDegreesToRadians(120,35,40));
        System.out.println("Time on the way:"+countingRoadTime(9,30,20,8));
    }
    public static double countComplexPercent(double depAmount, double depAnte) {
        return depAmount*Math.pow(1+depAnte/100,3);
    }
    public static double countSecondDegree(double number) {
        return  Math.pow(number, 2);
    }

    public static double countDiscriminant(double a,double b, double c) {
        return countSecondDegree(b) - 4 * a * c;
    }

    public static double[] rootCounting(double a, double b, double c) {
        double d = countDiscriminant(a,b,c);
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b- Math.sqrt(d)) / (2 * a);
        return new double[]{x1, x2};
    }

    public static double rootMultiplication(double a,double b, double c) {
        return rootCounting(a, b, c)[0]*rootCounting(a, b, c)[1];
    }

    public static int countTimeFromBegining(int hours, int minutes, int seconds) {
        return seconds + (minutes * SECONDS_IN_MINUTE) + (hours * SECONDS_IN_HOUR);
    }

    public static double countLengthOld(double sajen, double arshin, double vershok) {
        return (4.445/100) * (vershok + (arshin * 16) + (sajen * 48));
    }

    public static double countDegreesToRadians(double degrees, double minute, double second) {
        double angle = second + (SECONDS_IN_MINUTE * minute) + (SECONDS_IN_HOUR * degrees);
        return  angle * Math.PI / (180 * SECONDS_IN_HOUR);
    }


    public static int countingRoadTime(int hourStart, int minutesStart, int hoursArrival, int minutesArrival) {
        return  (minutesArrival + (SECONDS_IN_MINUTE * hoursArrival)) - (minutesStart + (SECONDS_IN_MINUTE * hourStart));
    }
}