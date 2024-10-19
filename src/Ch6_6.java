class SmallMath {
    int add(int x, int y) {
//        int z = x + y;
//        return z;
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }
}

public class Ch6_6 {
    public static void main(String[] args) {
        SmallMath smallMath = new SmallMath();

        System.out.println(smallMath.add(10, 20));
        System.out.println(smallMath.add(10, 20));
    }
}
