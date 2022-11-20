import java.util.Scanner;

/*
* Write a "Recursive" method in Java language without looping which obeys the following rule based on the n value
*  received from the user.
Rule : Subtract 5 from the entered number up to where the entered number is 0 or negative. Print the last value to the
*  screen during each subtraction. Add 5 again after the number is negative or 0. Again, print the last value of the number
*  on the screen in each addition operation.
* */

public class SearchPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int input = scanner.nextInt();
        if (findPrimes(input, 2)) {
            System.out.println(input + " sayısı ASALDIR !");
        } else {
            System.out.println(input + " sayısı ASAL değildir !");
        }
    }


    static boolean findPrimes(int input, int checker) {
        if (input <= 1) {
            return false;
        }
        else if(checker > input / 2){
            return true;
        }
        else if (input % checker == 0) {
            return false;
        }
        return findPrimes(input, checker + 1);
    }

}
