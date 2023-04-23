import java.util.Calendar;

public class 星期一 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1901, 0, 1);  // 从 0 开始
        int count = 0;
        while (cal.get(Calendar.YEAR) != 2001) {
            if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
                count++;
            }
            cal.add(Calendar.DATE, 1);
        }
        System.out.println(count);
    }

}
