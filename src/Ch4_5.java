public class Ch4_5 {
    public static void main(String[] args) {
        //continue 敘述
        int sum = 0;

        //continue 是回到迴圈的頭，break    是離開迴圈
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {  //如果等於0則是偶數
                continue; //回到迴圈的頭，
            }
            sum += i;
        }
        System.out.println("奇數的總和:" + sum);
    }

}
