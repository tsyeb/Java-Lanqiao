import java.util.Scanner;
public class AaddBtwo {
    public static void main(String[] args) {
        int a = 0; int b = 0; int n = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a + b);
            }
        }
    }
}
