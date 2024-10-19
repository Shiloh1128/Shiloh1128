class BigMath {
    //可變參數的設計 int add(int x, int ...y)
    int add(int x, int...y) {
        int total = x;
        for (int num : y) { //foreach
            total = total + num;
        }
        return total;
    }
}

public class Ch6_7 {
    public static void main(String[] args) {
        BigMath bigMath = new BigMath();
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(bigMath.add(0, 1));
        System.out.println(bigMath.add(0,1,2));
        System.out.println(bigMath.add(0,value));

    }
}
