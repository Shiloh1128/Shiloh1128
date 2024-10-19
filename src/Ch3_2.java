import java.util.Scanner;

public class Ch3_2 {
    public static void main(String[] args) {
        // 票價100元
        // 小於等於6歲或大於65歲, 票價打8折
        // 7-12歲或60-64歲,票價打9折
        double price;
        int age;
        int ticket = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("計算票價");
        System.out.println("請輸入歲數: ");
        age = scanner.nextInt();

        if (age >= 65 || age <=6 ){
            price = ticket * 0.8;
            //System.out.println(price);
        } else if (age <= 12 || age >= 60) {
            price = ticket * 0.9;
            //System.out.println(price);
        } else {
            price = ticket;
            //System.out.println(price);
        }
        System.out.println(price);

    }
}
