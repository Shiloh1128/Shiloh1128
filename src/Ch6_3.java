public class Ch6_3 {
    //這種寫法一定要用public static void(跟main一樣)
    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("Swap x=" + x);
        System.out.println("Swap y=" + y);

    }

    public static void main(String[] args) {
        //參數傳遞的方式
        //Call by value(傳遞值)
        //Call by address(傳遞位址)
        int x, y;
        x = 10;
        y = 15;
        System.out.println("before swap x=" + x);
        System.out.println("before swap y=" + y);
        swap(x, y);
        System.out.println("After swap x=" + x);
        System.out.println("After swap y=" + y);
    }
}
