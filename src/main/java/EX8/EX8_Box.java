public class EX8_Box {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[2]);
        int x2 = x * 2;
        System.out.println("a=" + a + ", b=" + b + ", x=" + x);

        if ( x2 >= a || x2 >= b ) {
            System.out.println("入力値に誤りがあります！");
        } else {
            int volume = CalcCapa(a,b,x);
            System.out.println("容積= " + volume);
        }
    }


    public static int CalcCapa(int a, int b, int x){
        return (a - 2 * x) * (b - 2 * x) * x;
    }
}
