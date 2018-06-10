package JavaStart.Lesson7.Level1;
/*
Created by matua on 09.06.2018 at 19:11
*/

import java.util.Calendar;
import java.util.Date;

public class One {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        Calendar oneMonthAgo = Calendar.getInstance();

        oneMonthAgo.set(Calendar.MONTH, today.get(Calendar.MONTH) - 1);

        Date todayDate = today.getTime();
        Date oneMonthAgoDate = oneMonthAgo.getTime();

        System.out.println(todayDate.getTime() - oneMonthAgoDate.getTime());
    }
}
