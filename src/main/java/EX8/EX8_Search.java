public class EX8_Search {
        /* 最小値の探索 */
        public int minimum(int[] arrayData) {
            int minValue = Integer.MAX_VALUE;       //最小値の初期値設定
    
            for (int value : arrayData) {
                if (value < minValue) {      //最小値を超える値のとき
                    minValue = value;        //最小値の設定
                }
            }
            return minValue;
        }
    
        /* 最大値の探索 */
        public int maximum(int[] arrayData){
            int maxValue = Integer.MIN_VALUE;       //最大値の初期値設定
    
            for (int value : arrayData) {
                if (value > maxValue) {      //最大値を超える値のとき
                    maxValue = value;        //最大値の設定
                }
            }
            return maxValue;
        }
}
