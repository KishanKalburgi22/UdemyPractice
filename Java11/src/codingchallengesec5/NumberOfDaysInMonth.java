package codingchallengesec5;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println("############################");
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(8, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else return year % 400 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else if (isLeapYear(year) && month == 2) {
            return 29;
        } else if (month == 2) {
            return 28;
        } else if (month > 7 && month % 2 != 0) {
            return 30;
        } else if (month > 7 && month % 2 == 0) {
            return 31;
        } else if (month < 8 && month % 2 == 0) {
            return 30;
        } else if (month < 8 && month % 2 != 0) {
            return 31;
        } else
            return -1;
    }
}
