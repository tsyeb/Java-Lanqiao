import java.util.Scanner;
public class AaddBfive {
    public static void main(String[] args) {
        int t = 0; int n = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int sum = 0;
                n = sc.nextInt();
                for (int j = 0; j < n; j++) {
                    sum += sc.nextInt();
                }
                System.out.println(sum);
            }
            System.out.println();
        }
    }
}
