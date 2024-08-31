import java.util.Scanner;

public class PerfectNum {

    public static boolean isPerfect(int n){
        int sum = 0;

        for(int i = 1 ; i<=n/2 ;i++){
            if(n%i==0) sum+=i;
        }
        if(sum == n) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();

        System.out.println(isPerfect(n));



    }
}
