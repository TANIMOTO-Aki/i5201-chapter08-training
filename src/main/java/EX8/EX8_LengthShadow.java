public class EX8_LengthShadow {
    public static void main(String[] args) {
        double h = Double.parseDouble(args[0]);
        double t = Double.parseDouble(args[1]);

        double shadowLength = EX8_Calc.LengthShadow(h,t);

        System.out.println("木の陰の長さを求めます。");
        System.out.println("高さ" + "\t\t" + "= " + args[0]);
        System.out.println("太陽の高角度" + "\t" + "= " + args[1] + "\n");
        System.out.println("影の長さ" + "\t" + "= " + shadowLength);
    }
}
