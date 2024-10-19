public class Ch6_13 {
    public static int add(int [] nums){
        int total = 0;
        for (int num:nums)
            total = total + num;
        return total;
    }
    public static void main(String[] args) {
        //int [] data = {1, 3, 5, 7, 9};
        //System.out.println(add(data));
        //匿名陣列
        System.out.println(add(new int [] {1, 3, 5, 7, 9}));
    }
}
