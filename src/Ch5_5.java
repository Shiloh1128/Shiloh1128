public class Ch5_5 {
    public static void main(String[] args) {
        //一維陣列 int [] num
        //多維陣列 ex:二維陣列 int [][] num, 三維陣列 int [][][] num

        //int [][] x;
        //x = new int[2][3];

        //同上
        //int [][] x = new int [2][3];
        System.out.println();
        //int[][] x = {{1, 2, 3}, {4, 5, 6}}; //記憶體位置自行參考上課註記

        //分層配置二維陣列
        int[][] y = new int[2][]; //宣告二維陣列，但先配置第一維空間
//        for (int i = 0; i < y.length; i++) {
//            y[i] = new int [3];
//        }

        //進而我們可以配置不同的長度二維陣列
        y[0] = new int[3];
        y[1] = new int[1];
        System.out.println(y[1].length);

    }
}
