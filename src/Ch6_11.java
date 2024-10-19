public class Ch6_11 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("main 函數裡的x: " + x);

        // 區域變數 local variable，只活在區域內，區域外就死掉
        {
            //因為重複宣告
            //int x = 15;
            int y = 20;
            System.out.println("區塊內的x: " + y);
        }

    }
}
