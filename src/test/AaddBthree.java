import java.util.Scanner;
public class AaddBthree {
    // 输入两正整数相加，两零为止
    public static void main(String[] args) {
        int a = 0; int b = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(a + b);
        }
    }
}
