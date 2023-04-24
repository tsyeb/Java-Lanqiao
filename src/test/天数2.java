import java.util.Calendar;

public class 天数2 {
    // 请问从 1949 年 10 月 1 日 到 2022 年 1 月 1 日需要过多少天？

    public static void main(String[] args) {
        long count = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(1949, 9, 1);
        while (cal.get(Calendar.YEAR) != 2022
                || cal.get(Calendar.MONTH) != 0
                || cal.get(Calendar.DATE) != 1) {
            cal.add(Calendar.DATE, 1);
            count++;
        }
        System.out.println(count);
    }

}