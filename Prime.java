package hello;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //checking a number prime or not
        System.out.println("enter a number: ");
        int number = input.nextInt();

        if (number <= 1){
            System.out.println("niether prime nor composite");
            return;
        }
        int c = 2;
        while ((c*c) < number){
            if (number % c == 0){
                System.out.println("Not Prime");
                return;
            }
            c++;
        }
        if (c*c > number){
            System.out.println("Prime");
        }

    }
}