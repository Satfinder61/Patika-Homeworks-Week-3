import java.util.Scanner;
/*
* Write a "Recursive" method in Java language without looping which obeys the following rule based on the n value received
*  from the user.
* Rule : Subtract 5 from the entered number up to where the entered number is 0 or negative. Print the last value to the
*  screen during each subtraction. Add 5 again after the number is negative or 0. Again, print the last value of the
*  number on the screen in each addition operation.
* */

public class PatternMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int input = scanner.nextInt();
        System.out.print("Çıktısı : ");
        int result =  Pattern(input);
    }
    static int Pattern(int input) {
        int lastValue = 0;
        lastValue = input;
        if (input > 0) {
            System.out.print(input + " ");
            input = Pattern(input - 5);
            System.out.print(input + " ");

        } else {
            System.out.print(input + " ");
            input = input + 5;
        }
        if (input   > lastValue){
            input = input - 5;
            }
        return input + 5;
    }

}
