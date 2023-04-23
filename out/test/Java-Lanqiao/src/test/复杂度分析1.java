import java.util.Scanner;

public class 复杂度分析1 {

    // 时间复杂度 易得 n * (n + 1) * (n + 2) / 6
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
