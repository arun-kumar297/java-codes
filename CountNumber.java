package hello;

public class CountNumber {
    public static void main(String[] args) {
        //in given number how many 5s are there
        int number = 235655;
        int count = 0;

        while (number > 0){
            int rem = number%10;
            if (rem == 3){
                count++;
            }
            number /= 10;
        }
        System.out.println(count);
    }
}
