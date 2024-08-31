import java.util.Scanner;

public class NeonNum {

    public static boolean isNeon(int n){
        int sq = n*n;
        int sqSum = 0;

        while (sq!=0) {
            int d = sq%10;
            sqSum += d;
            sq/=10;
        }
        if(n==sqSum) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n= scn.nextInt();

        System.out.println(isNeon(n));
    }
}
