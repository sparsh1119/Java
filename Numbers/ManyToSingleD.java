import java.util.Scanner;

public class ManyToSingleD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scn.nextInt();

        int sum =0;
        // while (n!=0) {
        //     int digit = n%10;
        //     sum+=digit;
        //     n/=10;
        //     if(n==0 && sum>9){
        //         System.out.println(sum);
        //         n=sum;
        //         sum=0;
        //     }
        // }

        do {
            while (n!=0) {
                int digit = n%10;
                sum+=digit;
                n/=10;
            }
            System.out.println(sum);
            n=sum;
            sum=0;
        } while (n>9);
    }
}
