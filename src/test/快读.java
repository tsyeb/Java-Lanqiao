import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 快读 {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        try {
            while ((line = in.readLine()) != null) {
                String[] s = line.split(" +"); // 正则表达式
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                System.out.println(a + b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}