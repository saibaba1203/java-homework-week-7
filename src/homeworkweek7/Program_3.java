


/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35)
 * and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * ___________
 * | |
 * | Mark Sheet |
 * |___________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |___________|
 * | Subjects : Marks |
 * |___________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |___________|
 * | Total : 273 |
 * |___________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |___________|
 */
package homeworkweek7;

import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {

        String result, grade = null;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String stuname = scan.next();

        System.out.print("Enter Student roll no: ");
        int rollno = scan.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = scan.nextInt();
        while (maths > 100 || maths < 0) {
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            maths = scan.nextInt();
        }

        System.out.print("Enter marks for Science: ");
        int science = scan.nextInt();
        while (science > 100 || science < 0) {
            System.out.println("Invalid Input, Science marks should be between 0 to 100");
            science = scan.nextInt();
        }

        System.out.print("Enter marks for English: ");
        int english = scan.nextInt();
        while (english > 100 || english < 0) {
            System.out.println("Invalid Input, English marks should be between 0 to 100");
            english = scan.nextInt();
        }

        float total = maths + science + english;
        System.out.println("Total marks for Maths + Science + English is: " + total);

        float percentage = total / 300 * 100;
        System.out.println("Percentage of all three subjects is: " + percentage);

        if (percentage >= 35) {
            result = "Pass";

        } else {
            result = "Fail";
            //System.out.println("Fail");
        }
        System.out.println(result);

        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade: " + grade);
        } else {
            grade = "";
        }

        System.out.println("|---------------------------------|");
        System.out.println("|         Mark Sheet              |");
        System.out.println("|---------------------------------|");
        System.out.println("| Name:       " + stuname + "                 |");
        System.out.println("| Roll No:    " + rollno + "                  |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Subjects        Marks          |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Maths           " + maths + "  |");
        System.out.println("|  Science         " + science + "     |");
        System.out.println("|  English         " + english + "     |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Total:          " + total + "          |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Percentage:     " + percentage + "         |");
        System.out.println("|  Result:         " + result + " |");
        System.out.println("|  Grade:          " + grade + "  |");
        System.out.println("|---------------------------------|");


    }

}

