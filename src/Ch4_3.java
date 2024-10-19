import java.util.Scanner;

public class Ch4_3 {
    public static void main(String[] args) {
        int num;
        int pwd = 55; //背下來密碼是pwd
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("請輸入密碼：");
            num = scanner.nextInt();         //讀入輸入
            if(num == pwd){
                System.out.println("恭喜猜對");
                break; // break 要加在 if 的時候，用於跳開無窮迴圈
            }
            else
                System.out.println("猜錯了！再猜一次");
        }


    }
}
