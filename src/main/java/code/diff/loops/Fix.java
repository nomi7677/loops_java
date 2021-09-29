package code.diff.loops;

import java.util.Scanner;

public class Fix {

    public static void main(String[] args) {

        // Problem 1
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum = i;
            System.out.println(sum);
        }


        // Problem 2
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("Blast off!");

        // Problem 3

        Scanner input = new Scanner(System.in);
        int product = 0;
        int n = input.nextInt(); // Change Me!

        for(int i = 0; i < n; i++){
            product = i;
        }

        System.out.println(product);
        // Problem 4
        int total = 0;
        for(int i = 0; i < n; i++){

            total += i*i;

        }
        System.out.println(total);
        // Problem 5
        String output = "";
        int x = input.nextInt(); // Change Me!

        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                output += i * j;
            }
        }

        System.out.println(output);

    }

}
