import java.util.Scanner;
public class 天数 {

    // 输入一个 1 到 12 的整数
    // 返回在 2021 年这个月的天数
    public static void main(String[] args) {
        int ls[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ls[n - 1]);
    }

}
