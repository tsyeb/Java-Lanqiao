import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 错误票据 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] m = in.readLine().split(" ");
            for (int j = 0; j < m.length; j++) {
                list.add(Integer.parseInt(m[j]));
            }
        }
        Collections.sort(list);
        int m = 0;  // 断号
        int x = 0;  // 重号
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) == 2) {
                m = list.get(i + 1) - 1;
            }
            if (list.get(i + 1) - list.get(i) == 0) {
                x = list.get(i);
            }
        }
        out.print(m + " " + x);
        out.flush();
    }

}
