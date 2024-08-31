import java.util.Scanner;

public class neonNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        int sq = n*n;
        int sqSum =0;

        // for(int i = sq ; i>0 ; i /=10){
        //     sqSum += i%10;
        // }

        while (sq!=0) {
            int d = sq %10;
            sqSum += d;
            sq /=10;
        }

        if (sqSum==n) {
            System.out.println("Number is neon");
        }else{
            System.out.println("Number is not neon");
        }
    }
}
