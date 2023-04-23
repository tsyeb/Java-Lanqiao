/*
判断闰年的程序
*/
public class LeapYear {

    public static void main(String[] args) {
        int count = 0;  // 记录闰年数量

        for (int year = 2000; year <= 2100; year++) {
            if (isLeapYear(year)) {
                count++;
                System.out.println(year + "是闰年");
            }
        }

        System.out.println("从2000到2100闰年有" + count);
    }

    // 判断是否是闰年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || year % 400 == 0;
    }

}
