// 6. Write a java program to input any number and find out if it’s odd or even
package homeworkweek7;

import java.util.Scanner;

public class Program_6 {


    public static void oddeven(int num) {

        if (num % 2 == 0)
            System.out.println(num + " is even number.");
        else
            System.out.println(num + " is odd number.");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to check odd or even: ");
        int num = scan.nextInt();

        oddeven(num);
    }
}



