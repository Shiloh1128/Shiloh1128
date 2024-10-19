public class Ch5_4 {
    public static void main(String[] args) {
        // 參照資料型態 (Reference Data Types)
        // --> 原始資料以外，都是參照型態:String, Array, object(物件)
        // 原始資料型態 (Primitive Data Types):byte, short, int, long, float, double, boolean, char
        // --> 在宣告變數值時,值直接放在變數內

        int[] num = {30, 20, 10};
        int[] num2 = num; //num2 = {30, 20, 10}

        System.out.println("num=" + num[1]);
        System.out.println("num2=" + num2[1]);
        System.out.println("=== 更改num2[1]內容後 ===");
        num2[1] = 50;  //num2 = {30, 50, 10}
        System.out.println("num=" + num[1]);
        System.out.println("num2=" + num2[1]);
    }
}
