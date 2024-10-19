import java.util.Scanner;

public class Ch3_5 {
    public static void main(String[] args) {
        //下面是Java 17 的寫法

        int score;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 計算期末成績 ===");
        System.out.println("請輸入分數");
        score = scanner.nextInt();

        switch (score / 10) {
            case 9 -> {
                System.out.println("A");
                System.out.println("AA");
            }
            case 8 -> System.out.println("B");

            case 7 -> System.out.println("C");

            case 6 -> System.out.println("D");

            default -> System.out.println("F");
        }
    }
}
