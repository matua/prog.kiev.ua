package JavaStart.Lesson7.Level2;
/*
Created by matua on 10.06.2018 at 11:02
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("d/M/y");
        Scanner scanner = new Scanner(System.in);
        Date inputDate = new Date();

        try {
             inputDate = inputFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar now = Calendar.getInstance();

        Calendar input = Calendar.getInstance();
        input.setTime(inputDate);

        if (now.get(Calendar.DAY_OF_MONTH) != input.get(Calendar.DAY_OF_MONTH)) {
            System.out.format("Current day is %s: ", now.get(Calendar.DAY_OF_MONTH));
            System.out.format("Your date day is %s", input.get(Calendar.DAY_OF_MONTH));
            System.out.println();
        }
        if (now.get(Calendar.MONTH) != input.get(Calendar.MONTH)) {
            System.out.format("Current month is %s: ", now.get(Calendar.MONTH));
            System.out.format("Your date month is %s", input.get(Calendar.MONTH));
            System.out.println();
        }
        if (now.get(Calendar.YEAR) != input.get(Calendar.YEAR)) {
            System.out.format("Current year is %s: ", now.get(Calendar.YEAR));
            System.out.format("Your date year is %s", input.get(Calendar.YEAR));
            System.out.println();
        }
    }
}
