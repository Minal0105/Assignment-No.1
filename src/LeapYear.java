import java.util.Scanner;
public class LeapYear {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            // Check if the year is valid
            if (year < 1582) {
                System.out.println("Invalid year. The program only works for year >= 1582.");
                return;
            }

            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }


