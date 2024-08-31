import java.util.Scanner;

public class HappyNum {

    public static int digitSquareSum(int n){
        int sum =0;
        while (n!=0) {
            int digit = n%10;
            sum += digit*digit;
            n/=10;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        int m=n;
        while (m!=1 && m!=4) {
            m=digitSquareSum(m);
        }
        if(m==1) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();

        System.out.println(isHappy(n));
    }
}
