import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();

        int sum =0;
        int temp = n;

        while (n>0) {
            int digit = n%10;
            int product =1;
            for(int i =1; i<=digit; i++){
                product*=i;
            }
            sum+=product;
            n/=10;
        }

        if(temp == sum) System.out.println("Strong Number");
        else System.out.println("Not a Strong number");
    }
}
