public class 门牌制作 {
    // 1 到 2022 有多少个 2
    public static void main(String[] args) {
        long count = 0;
        for (int i = 1; i <= 2020; i++) {
            int n = i;
            while (n != 0) {
                if (n % 10 == 2) {
                    count++;
                }
                n /= 10;
            }
        }
        System.out.println(count);
    }
}
