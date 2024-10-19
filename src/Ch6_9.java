public class Ch6_9 {
    public static void main(String[] args) {
        // 會活到整個程式結束
        int x = 10;
        System.out.println("main 函數裡的x: " + x);

        // 區域變數 local variable，只活在區域內，區域外就死掉
        {
            int y = 20;
            System.out.println("區塊內的x: " + x);
            System.out.println("區塊內的y: " + y);
        }
    }
}
