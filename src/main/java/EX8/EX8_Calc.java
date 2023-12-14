public class EX8_Calc {
    public static double LengthShadow(double h, double t) {
        double t2 = Angle2Radian(t);
        return h / Math.tan(t2);
    }

    public static double Angle2Radian(double angle) {
        return angle * 3.14159 / 180;
    }
}
