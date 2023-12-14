public class EX8_Search2 {
    /* 最小値の探索 */
    public int minimum(int[] arrayData) {
        int minValue = Integer.MAX_VALUE;       //最小値の初期値設定

        for (int i = 0; i < arrayData.length; i++) {
            minValue = Math.min(minValue,arrayData[i]); //最小値の設定
        }
        return minValue;
    }

    /* 最大値の探索 */
    public int maximum(int[] arrayData){
        int maxValue = Integer.MIN_VALUE;       //最大値の初期値設定

        for (int i = 0; i < arrayData.length; i++) {
            maxValue = Math.max(maxValue,arrayData[i]); //最大値の設定
        }
        return maxValue;
    }
}
