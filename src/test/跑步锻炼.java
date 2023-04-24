import java.util.Calendar;

public class 跑步锻炼 {

    // 2000年01月01日到2020年10月01日
    // 周一或者月初(01日) count += 2
    // 其余 count += 1
    public static void main(String[] args) {
        long count = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(2000, 0, 1);
        while (cal.get(Calendar.YEAR) != 2020
                || cal.get(Calendar.MONTH) != 9
                || cal.get(Calendar.DATE) != 2) {
            if (cal.get(Calendar.DAY_OF_WEEK) == 2
                    || cal.get(Calendar.DATE) == 1){
                count++;
                count++;
            }
            else {
                count++;
            }
            cal.add(Calendar.DATE, 1);
        }
        System.out.println(count);
    }
}