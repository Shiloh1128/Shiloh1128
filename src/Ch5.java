public class Ch5 {
    public static void main(String[] args) {
        // 陣列(Array) : []
        // 資料型態 [] 陣列名稱; ex: int [] iArray; //物件導向設計師大喜歡這種類型寫法
        // 或
        // 資料型態 陣列名稱 []; ex: int iArray []; 舊式c/c++ 寫法
        /*
        int [] score;
        float [] score;
        float []degree;
         */
        double deg1 = 20;
        double deg2 = 24;
        double deg3 = 26;
        double deg4 = 27;
        double deg5 = 23;
        double deg6 = 11;
        double deg7 = 15;
        double avg; //average

        avg = (deg1 + deg2 + deg3 + deg4 + deg5 + deg6 + deg7) / 7;
        System.out.println("一周平均溫度:" + avg);

        //這種寫法真的非常爛!!!所以要學陣列
    }
}
