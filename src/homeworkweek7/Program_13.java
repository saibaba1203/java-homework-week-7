/* 13. Write a Java program which input any number between 1 to 7 and it print The Days
 name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

package homeworkweek7;


import java.util.Scanner;

public class Program_13 {

    // Method to get name of week
    public static String daysOfWeek(int day) {

        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Week contains 1 to 7 days";

        }
        return dayName;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = scan.nextInt();

        System.out.println(daysOfWeek(day));
    }
}



