public class Ch4_1 {
    public static void main(String[] args) {
        //while迴圈: 與for迴圈最大的差異在於沒有"初始值"和"迭代式" 在()內
        //會把初始值移到上面,迭代式移到區塊內
        /*
        while(條件式){
            程式區塊
        }

         */
        //int j; //灰色代表我們用不到
        int i = 1; //初始化往上移
        int sum = 0;
        while ( i <= 10){
            sum += i;
            System.out.println("i=" +i +"sum="+sum); //""裡面若是空格, 空格會被印出來
            i++; //迭代式往內移
        }
    }
}
