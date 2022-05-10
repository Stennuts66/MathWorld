package mathWorld;

import static java.lang.Math.PI;

public class degree2Radian {
    static String desc = """
            Java program to convert degree to radian. The radian is the standard unit of angular measure, 'used in many areas of mathematics.
            An angle's measurement in radians is numerically equal to the length of a corresponding arc of a unit circle.
            """;
    static String getDesc() {
        return desc;
    }
    static double initialDegrees = 15;

    static double getInitialDegrees() {
        return initialDegrees;
    }
    static double calculate2Radian() {
        double initialDegrees = getInitialDegrees();
        return initialDegrees * (PI/180);
    }
    static String concatenatedRadians() {
        return String.format("%.5f", calculate2Radian());
    }

    public static String getDegree2Radian() {
        return degree2RadianSolution;
    }
    static String degree2RadianSolution = (getDesc() + "\nTo convert: " + getInitialDegrees() + " degrees" +
            " | Converted to: " + concatenatedRadians() + " radians.");
}