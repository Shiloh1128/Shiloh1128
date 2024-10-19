public class Ch6_10 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("main 函數裡的x: " + x);

        // 區域變數 local variable，只活在區域內，區域外就死掉
        {
            int y = 20;
            System.out.println("區塊內的x: " + y);
        }
        //原本的20已經死掉，會重新宣告建立新的30

        int y = 30;
        System.out.println("區塊外的x: " + y);
    }
}
