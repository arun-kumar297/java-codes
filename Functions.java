package hello;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        fun("arun");
//        multiples(2,3);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //IsPrime checking and return boolean value as result
        boolean ans = IsPrime(n);
        System.out.println(ans);
    }

     static boolean IsPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
//    static void fun(String a){
//        System.out.println("Hello Fun " + a);
//    }
//
//    static void multiples(int a, int b){
//        int c = a * b;
//        System.out.println(c);
//    }

}

