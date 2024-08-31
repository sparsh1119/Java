import java.util.Scanner;

public class spyNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scn.nextInt();

        int sum =0;
        int product = 1;

        while(n!=0){
            int digit = n%10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        // for(int i = n ; i>0 ; i/=10){
        //     sum += i%10;
        //     product*=i%10;
        // }

        if(sum == product){
            System.out.println("Number is spy Number");
        }else{
            System.out.println("Number is not spy number");
        }
    }
}
