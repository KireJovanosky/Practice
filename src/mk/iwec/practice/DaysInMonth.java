package mk.iwec.practice;

public class DaysInMonth {

    public  int calculateDays(int month, int year){

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear == true) {
            return 29;
        } else {
            return daysPerMonth[month - 1];
        }
    }

    }



