

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if  any other alphabet should be invalid entry
 */
package homeworkweek7;

import java.util.Scanner;

public class Program_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character from A to F: ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("Ahmedabad");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("Bhavnagar");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("Chotila");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("Dakor");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("Edar");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("France");
        } else {
            System.out.println("Invalid Entry");
        }
        scanner.close();
    }
}



