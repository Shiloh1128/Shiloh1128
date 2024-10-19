public class Ch4_6 {
    public static void main(String[] args) {
        //迴圈標籤(java才有)
        outerloop:/*通常是給名稱*/for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*"); // 列印乘號
                if (j >= i) {
                    System.out.println("");
                    continue  outerloop;
                }
            }

        }
    }
}
/*
987654321
98765432
9876543
987654
9876

 */