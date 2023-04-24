import java.util.Scanner;
public class Print {
    // 输入一个 0 到 10 的 正整数 n
    // 输出 pi (保留 pi 的 n 位小数)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.1415926535;
        int n = sc.nextInt();
        System.out.printf("%." + n + "f", pi);
    }

}
