public class EX8_MaxMinRain {
    public static void main(String[] args) {
        int[] Months = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] Deys = new int[12];
        EX8_Search sh = new EX8_Search();
        
        /* 日数を入力 */
        System.out.println("雨天の日数を入力？");
        for (int i = 0; i < Deys.length; i++) {
            Deys[i] = Integer.parseInt(args[i]);
            System.out.println(Months[i] + "月？ " + Deys[i]);
            }

        /* 最も多い・少ない雨量の表示 */
        System.out.println("最も多い雨量" + "\t" + sh.maximum(Deys) + "mm");
        System.out.println("最も少ない雨量" + "\t" + sh.minimum(Deys) + "mm");
    }
}
