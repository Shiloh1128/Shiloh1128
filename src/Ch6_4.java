class Swap {
    int x, y;

}

public class Ch6_4 {

    public static void swapFunction(Swap s) {
        int tmp = s.x;
        s.x = s.y;
        s.y = tmp;
        System.out.println("Swap內部 x=" + s.x);
        System.out.println("Swap內部 y=" + s.y);

    }

    public static void main(String[] args) {
        //Call by address/reference
        //Java 傳遞的陣列Array或類別class，這時候就是reference data type(參照資料型態)，所以傳遞就是位址
        Swap swap = new Swap();
        swap.x = 10;
        swap.y = 15;
        System.out.println("Before x=" + swap.x);
        System.out.println("Before y=" + swap.y);
        swapFunction(swap);
        System.out.println("After x=" + swap.x);
        System.out.println("After y=" + swap.y);
    }
}
