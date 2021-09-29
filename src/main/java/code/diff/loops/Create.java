package code.diff.loops;

import java.util.Scanner;

public class Create {

    public static void main(String[] args) {

        // Problem 1
        // Display the following shape
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *

        System.out.println("Problem 1");
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j=i; j<=n; j++){
                System.out.print("  ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Problem 2
        // Given the number of rows, create a triangle with that many rows.
        // For example, if rows = 5 then
        // *
        // **
        // ***
        // ****
        // *****

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // Problem 3
        // Using the celsius to fahrenheit conversion, product the following table
        // |Celsius|Fahrenheit|
        // | 0     | 32       |
        // | 1     | 33.8     |
        // | 2     | 35.6     |
        // | ...   | ...      |
        // | 30    | 86       |
        int celsius = 0;
        double fahrenheit;
        System.out.println(" | "+"celsius"+"|"+"fahrenheit"+"| ");

        while(celsius <=30 ) {
            fahrenheit = (9.0/5.0 * celsius) + 32;
            System.out.println(" | " + celsius + "      | " + fahrenheit + "     | ");
            celsius++;
        }
        // Problem 4
        // Ask for value of a variable and check if it is a prime number.
        int temp = 0;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =scan.nextInt();
        scan.close();

        for (int i=2; i<num/2; i++){
            temp = num%i;
            if (temp == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num + "is a prime number");
        }else{
            System.out.println(num + "is not a prime number");
        }

        // Problem 5
        // The Kalebnacci sequence begins with 2 and -1 as its first and second terms.
        // After these first two elements, each subsequent element is equal to twice the previous term minus the previous term.
        // kaleb(0) = 2
        // kaleb(1) = -1
        // kaleb(n) = 2*kaleb(n-2) - kaleb(n-1)
        // Find the nth number in the sequence

        int n = 10;
        int a = 2;
        int b = -1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i =0; i<n;i++){
            c =2*a-b;
            System.out.print(c + " " );
            a=b;
            b=c;
        }


    }
}
