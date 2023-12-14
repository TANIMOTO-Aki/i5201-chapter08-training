public class EX8_MaxMinRain {
    public static void main(String[] args) {
        int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] days = new int[12];
        EX8_Search2 sh = new EX8_Search2();
        
        /* 日数を入力 */
        System.out.println("雨天の日数を入力？");
        for (int i = 0; i < days.length; i++) {
            days[i] = Integer.parseInt(args[i]);
            System.out.println(months[i] + "月？ " + days[i]);
            }

        /* 最も多い・少ない雨量の表示 */
        System.out.println("最も多い雨量" + "\t" + sh.maximum(days) + "mm");
        System.out.println("最も少ない雨量" + "\t" + sh.minimum(days) + "mm");
    }
}
