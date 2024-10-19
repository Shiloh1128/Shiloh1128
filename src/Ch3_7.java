import java.util.Scanner;

public class Ch3_7 {
    public static void main(String[] args) {
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入身高 : ");
        height = scanner.nextInt();

        double weight;
        System.out.println("請輸入體重 : ");
        weight = scanner.nextInt();

        double bmi;

        bmi = weight / (height / 100) * (height / 100);

//        if (bmi >15  && bmi<30 ){
//            System.out.println("體重正常");
//        }
//        else {
//            System.out.println("體重不正常");
//        }


        if (bmi > 30) {
            System.out.println("體重過重");
        } else if (bmi < 15) {
            System.out.println("體重過輕");
        } else {
            System.out.println("體重正常");
        }


        //過重 >30
        //過輕 <15
        //正常
    }
}
