package hello;

//print all three digit Armstrong numbers b/w 100 and 1000 using fun nd methods
public class Armstrong {
    public static void main(String[] args) {
        for (int i = 153; i < 154; i++) {
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

     static boolean isArmstrong(int n) {
        int org = n;
        int sum = 0;
        while (n > 0){
            int rem = n%10;
            n/=10;
            sum += rem*rem*rem;
        }
        return sum == org;
    }
}
