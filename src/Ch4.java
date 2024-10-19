public class Ch4 {
    public static void main(String[] args) {
        //for 迴圈
        int sum = 0; //一定要給初始值
        //sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10; //很笨的寫法
        //聰明的寫法 : 用for迴圈
        // int i; //現在都打宣告寫在裡面
        for (int i = 1; i <= 10; i++) {  // i = i + 1;
            //sum = sum + i;  //求總和公式
            sum += i; // 意義同上
        }
        System.out.println(sum);

        /*
        for(初始值; 判斷式; 迭代式){

        }
         */
    }
}
