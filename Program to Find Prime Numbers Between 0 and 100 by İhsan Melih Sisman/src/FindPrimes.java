import java.util.Scanner;
/*
* Write a program that prints prime numbers from 1 to 100 in Java.
* */


public class FindPrimes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        for(int i = 2; i<100;i++){
            boolean isPrime = true;

            for (int j = 2; j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }

        }

    }

