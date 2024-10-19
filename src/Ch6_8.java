public class Ch6_8 {
    public static void main(String[] args) {

        int x = 10;
        System.out.println("main 函數裡的x: " + x);

        //區域變數 local variable
        {
            int y = 10;
            System.out.println("區塊內的函數y: " + y);
        }
        //錯！！！變數y 超過有效範圍
        //System.out.println("main 函數裡的y: " + y);
    }
}
