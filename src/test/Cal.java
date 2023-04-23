import java.util.Calendar;

public class Cal {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        // 输出年月日
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));

        // 输出 星期几
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        // 0 星期天
        cal.add(Calendar.DATE, 1111);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));
    }
}
