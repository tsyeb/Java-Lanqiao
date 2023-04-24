import java.util.Scanner;
public class AaddBfour {
    public static void main(String[] args) {
        int a = 0; int b = 0; int n = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
