import java.util.Scanner;

public class SpyNum {

    public static boolean isSpy(int n){
        int sum =0;
        int product = 1;

        while(n!=0){
            int digit = n%10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        if (sum == product) {
            return true;
        }
        else{
            return false;
        } 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();

        System.out.println(isSpy(n));

    }
}
