package hello;

public class Fibonacci {
    public static void main(String[] args) {
        // find Nth Fibonacci number
        int n = 8;
        int a = 0;
        int b = 1;

        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;

            count++;
        }
        System.out.println(b);
    }
}
