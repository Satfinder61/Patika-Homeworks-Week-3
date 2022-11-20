import java.util.Scanner;
/*
Write a program in Java that takes the number of digits from the user and draws an inverted triangle to the screen with
asterisks (*) using loops.
Number of Digits: 10
*/

public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int i = 10; i>=1;i--)
        {
            for(int z = i; z<10;z++)
            {
                System.out.print(" ");
            }
            for(int m =1;m<=(2*i-1);m++)
            {
            System.out.print("*");
              }
            System.out.println("");
        }

    }
}
