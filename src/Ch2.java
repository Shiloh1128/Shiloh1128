public class Ch2 {
    public static void main(String[] args) {
        // 程式基本運算
        // 運算子 Operator
        // 運算元 Operand
        // 二元運算 operand operator operand ex: 9 + 12 (+-*/都可以)
        // 單元運算 (背)(背)(背) i++ (遞增1), i-- (遞減1)
        // i++ 相當於a.k.a. i = i + 1
        // i-- 相當於a.k.a. i = i - 1
        // 三元運算 (背)(背) ex: 運算 ? 值 : 值
        int x, value;
        x = -10;
        value = - (x + 5) * 3;
        System.out.println(value);

        // 考點 : 浮點數 / 0 --> 無限大+- infinity
        double d;
        d = 100.0 / 0;
        System.out.println(d);

        d = -100.0 / 0;
        System.out.println(d);


        // 考點 : 整數 / 0 --> 報錯，因為分母不得為0
        //int i;
        //i = 100 / 0;
        //System.out.println(d);


        //NaN = Not a Number 非數字
        d = 5.5 % 0; //% mod求 餘數
        System.out.println(d);
        d = -5.5 % 0;
        System.out.println(d);

        // Java 優先權順序
        // 1. 括號 ()
        // 2. 遞增++ , 遞減-- , 正號 , 負號
        // 3. 乘法 * , 除法 / , 求餘式 %
        // 4. 加法 + , 減法 -

        boolean bo;
        bo = true; //在Java 裡面只能用true/false, 不能用1/0
        System.out.println(bo);
        bo = false;
        System.out.println(bo);

        //比較運算式
        // > 大於, < 小於, >=, <=, == 等於, != 不等於

        //邏輯運算式
        // && & AND
        // || | OR
        boolean a = true;
        boolean b = false;
        System.out.println( a && a );
        System.out.println( a && b );

        System.out.println( a || a );
        System.out.println( a || b );

        // &&(||) 跟&(|) 差別
        // &&(||): 邏輯運算短路 logical short circuit
        // 左邊可以決定, 就決定了吧, 不要再理右邊
        System.out.println( a && b );
        System.out.println( b && a );

        //左右兩邊都要去看才能決定結果
        System.out.println( a & b );
        System.out.println( b & a );

        // ^, XOR, exclusive or: 運算元相同時回傳false, 否則回傳true
        /*

        a    b   a^b
        0    0    0
        0    1    1
        1    0    1
        1    1    0

         */
        //沒有這種東西:^^
        System.out.println( a ^ a );
        System.out.println( a ^ b );

        //再談三元運算子
        int i, j, larger, smaller;
        i = 100;
        j = 50;
        larger = i > j ? i: j ;
        System.out.println(larger);

        smaller = i < j ? i : j;
        System.out.println(smaller);

        //位元運算bitwise operation 跳過

    }
}
