public class Ch8_3 {
    public static void main(String[] args) {
        int[] lotte = new int[6];

        for (int i = 0; i < 6; i++) {
            lotte[i] = (int)(Math.random() * (42 - 1 + 1)) + 1;
            System.out.printf("%d ",lotte[i]);
        }

    }
}

