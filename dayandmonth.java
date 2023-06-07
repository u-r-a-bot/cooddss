import java.util.Scanner;

class MonthError extends Exception{
    @Override
    public String getMessage() {
        return " Value of Month is wrong";
    }
}
class DayError extends Exception{
    @Override
    public String getMessage() {
        return "Value of String is wrong";
    }
}

public class dayandmonth {
    static String monthName(int a) {
        switch (a) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }

    static int nodayinm(int a) {
        int[] thirtyone = {1, 3, 5, 7, 8, 10, 12};
        int[] thirty = {4, 6, 9, 11};
        for (int i = 0; i < thirtyone.length; i++) {
            if (thirtyone[i] == a)
                return 1;
        }
        for (int i = 0; i < thirty.length; i++) {
            if (thirtyone[i] == a)
                return 2;
        }
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean runner = true;
        int month = 0, day = 0;
        while (runner) {
            System.out.println("Enter Date Month and day in Month/Day");
            String date = sc.next();
            try {
                String st[] = date.split("/");
                try {
                    month = Integer.parseInt(st[0]);
                    if (month <= 0 || month >= 13)
                        throw new MonthError();
                } catch (Exception mon) {
                    throw new MonthError();
                }
                try {
                    day = Integer.parseInt(st[1]);
                    switch (dayandmonth.nodayinm(month)) {
                        case 1:
                            if (day <= 31 && day > 0) {

                            } else {
                                throw new DayError();
                            }
                            break;
                        case 2:
                            if (day <= 30 && day > 0) {

                            } else {
                                throw new DayError();
                            }
                            break;
                        case 3:
                            if (day <= 29 && day > 0) {

                            } else {
                                throw new DayError();
                            }
                            break;
                    }
                } catch (Exception d) {
                    throw new DayError();
                }
                System.out.println("That is same as " + dayandmonth.monthName(month) + " " + day + " ?(Enter y or n)");
                String run = sc.next();
                if(run.charAt(0)=='y'||run.charAt(0)=='Y') runner = false;
                else System.out.println("Try again :)");
            } catch (DayError de) {
                System.out.println("Wrong day entered\nTry again (Enter y or n)");
                String run1 = sc.next();
                if(run1.charAt(0)=='n'||run1.charAt(0)=='N') runner = false;
            } catch (MonthError me) {
                System.out.println("Wrong month entered\nTry again (Enter y or n)");
                String run2 = sc.next();
                if(run2.charAt(0)=='n'||run2.charAt(0)=='N') runner = false;
            }

        }
    }
}