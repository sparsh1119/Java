
import java.util.Scanner;

public class PrimeNum {

    public static boolean isPrime(int n ){

        if(n<=1) return false;
        for(int i =2 ; i<=n/2 ; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();

        System.out.println(isPrime(n));

    }
}
