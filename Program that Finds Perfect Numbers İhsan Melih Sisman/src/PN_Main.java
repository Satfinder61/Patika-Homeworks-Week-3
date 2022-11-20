import java.util.Scanner;
/*
It finds whether or not a number entered from the keyboard is a perfect number, and if the number is a perfect number,
"it is a perfect number." if not, "it's not a perfect number." Write the program that writes the expressions to the screen
in Java language.
 */

public class PN_Main {
    public static void main(String[] args) {

        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int enteredNumber = scanner.nextInt();

        for (int i = 1; i < enteredNumber; i++) {
            if (enteredNumber % i == 0) {
                total = total + i;

            }
        }
        if (total == enteredNumber) {
            System.out.println(enteredNumber + " Mükemmel sayıdır");
        } else {
            System.out.println(enteredNumber + " Mükemmel sayı değildir.");

        }
    }
}
