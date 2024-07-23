import java.time.LocalDate;
import java.util.Date;

public class Task3 {
    /*
    TODO: write a program to check if given year is a leap year
     */
    
//    Leap Year definition:
// Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100
// , but these centurial years are leap years if they are exactly divisible by 400
    public static void main(String[] args) {
//        sout
        System.out.println(solution1(1920));
        System.out.println(solution2(1920));
        System.out.println(solution1(1996));
        System.out.println(solution2(1996));
        System.out.println(solution1(2000));
        System.out.println(solution2(2000));
        System.out.println(solution1(2100));
        System.out.println(solution2(2100));

        System.out.println(solution1(4000));
        System.out.println(solution2(4000));
    }

    public static boolean solution1(int y) {
        boolean isDivBy4 = y % 4 == 0;
        boolean isDivBy100 = y % 100 == 0;
        boolean isDivBy400 = y % 400 == 0;
        boolean isDivBy1000 = y % 1000 == 0;
        if (isDivBy4 && !isDivBy100) {
            return true;
        } else return isDivBy1000 && isDivBy400;
    }

    public static boolean solution2(int y) {
        return LocalDate.of(y,1, 1).isLeapYear();
//        return false;
    }
}
