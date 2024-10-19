import java.util.Scanner;

public class Ch3_1 {
    public static void main(String[] args) {
        int score;
        Scanner scanner = new Scanner(System.in);
        System.out.println("計算期末成績");
        System.out.println("請輸入分數：");
        score = scanner.nextInt();

        // if...else if...else 互相不干擾
        if(score >=90){  //只有一行可以拿掉左右大括號{}
            System.out.println("A");
        } else if (score >=80) {
            System.out.println("B");
        } else if (score >=70) {
            System.out.println("C");
        } else if (score >=60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }
}
