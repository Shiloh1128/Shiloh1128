import java.util.Scanner;

public class Ch3_4 {
    public static void main(String[] args) {
        //switch

        //case可以很多個
        //break 不可以不打！背x 100
        //下面是Java 8的寫法
        /*
        switch(變數){
            case 值A:
                程式敘述;
                break;
            case 值B:
                程式敘述;
                break;
            default:
                程式敘述;
                break;
        }
         */
        int score;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 計算期末成績 ===");
        System.out.println("請輸入分數");
        score = scanner.nextInt();   // 讀取成績

        switch (score / 10){         // 取10位數當判斷式, 這個邏輯背下來
            case 9:
                System.out.println("A");
                break;               // 假設break 沒打, 程式會一直跑下去, 直到遇到下一個break
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
        }
    }
}
