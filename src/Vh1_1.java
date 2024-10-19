public class Vh1_1 {
    public static void main(String[] args) {
        //變數的意義
        //變數命名是有意義的，盡量不要亂命名
        //每一行都要以分號做結尾

       /*
       int hour_salary; //時薪
        int month_salary;//月薪
        int annual_salary;//年薪
        //snake_type 蛇式 ex:Python
        */

        int hourSalary; //時薪
        int monthSalary;//月薪
        int annualSalary;//年薪
        //camelType 駱峰式 (最常用) ex: c/c++/java...oop

        /*
        int hour-salary//時薪
        int month-salary;//月薪
        int annualsalary;//年薪
        //B-B-Q式 ex: html/css
         */

        //變數命名的規則
        /*
        1***.可以英文開頭，數字開頭不行，但BUT數字放在裡面是可以的
        2**.可以_(底線)開頭
        3**.可以$開頭
        4.變數長度是沒有限制
        5***.英文大小寫是敏感的 ex: int SUM 跟 int sum 是不一樣的變數喔!!!
        int Sum , int sUm or int sum 有沒有一樣? No
        6.因為 Unicode 的關係，可以中文字當變數(最好不要) ex: int 高老師
         */


        /*
        int 3y; //no
        int y3; //yes
        int y3y; //yes

        int x y; //no
        int x-y; //no
        int x+y; //no

        int _x; //yes
        int ___x; //yes
         */

        //基本資料型態 primitive data types
        /*
        1. 整數(integer, int)和浮點數(floating point, fp)(小數)
            依大小區分
            1.1 byte   (8位元)
            1.2 short  (16位元)
            1.3 int    (32位元)
            1.4 long   (64位元)

            1.5 float
            1.6 double
        2. 字元(character, char)
        3. 布林值(boolean): True / False

         */
        double d = 1.05; // = : assign

        System.out.println(d); //sout快捷鍵
        System.out.println(d); //println: 自動換行

        d = .789;
        System.out.println(d);

        d = 7; //會自己補0
        System.out.println(d); //

        float f = 1.05f;
        //f = 1.05; //因為Java預設浮點數是double，所以float 要加上f 或 F  //double是float兩倍
        //f = 1.05;
        //f = 1.05f;
        //f = 1.05F;
        //有些程式設計師的習慣會在double 後面加上d
        d = 1.05d;

        char ch = 'a';
        //ch = 'a'; //給予字元值時要記得加上' '
        //System.out.println(ch);
        //ch = '陳';
        //System.out.println(ch);

        //超過一個字的時候，我們給它一個名字叫做字串(String)
        String str;
        str = "I love Java"; //給予字串值時要記得加上" "
        System.out.println(str);

        int i = 6;
        i = 8;
        i = 10;
        System.out.println(i);

        final int j = 7; //final 定值常數
        // j = 9; 所以不能再賦值
        System.out.println(j);

        final double pi = 3.1415926;
        int r = 5;
        System.out.println( r * r * pi ); //計算圓面積
    }
}


