import java.util.Scanner;
/*
* The Fibonacci series is a sequence of numbers formed by adding each number with the previous one. In this series, which
*  continues in this way, the golden ratio emerges when the numbers are proportional to each other, that is, when a number
*  is divided by the number before it, a series that approaches the golden ratio is obtained.

The Fibonacci sequence starts from 0 and goes on to infinity. Each digit is added up with the previous digit. The result
*  obtained is written on the right side of the figure. The first ten numbers of the Fibonacci sequence are as follows:
* */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstOne = 0;
        int secondOne = 1;
        int input = 9;

        System.out.print(input + " Elemanlı Fibonacci Serisi : ");

        for (int i = 0; i <= input; i++) {
            System.out.print(firstOne + " ");
            int nextOne = firstOne + secondOne;
            firstOne = secondOne;
            secondOne = nextOne;


        }


    }
}
