package day7;
import java.util.ArrayList;

public class demo5 {
    public static void main(String[] args) {
        ArrayList<String> arrListWeek = new ArrayList<>(7);
        arrListWeek.add("Monday");
        arrListWeek.add("Tuesday");
        arrListWeek.add("Wednesday");
        arrListWeek.add("Thursday");
        arrListWeek.add("Friday");
        arrListWeek.add("Saturday");
        arrListWeek.add("Sunday");
        arrListWeek.add("Holiday");

        arrListWeek.remove(7);

        System.out.println("Cac phan tu trong danh sach la: ");
        for (String week : arrListWeek) {
            System.out.println(week);
        }
    }
}
