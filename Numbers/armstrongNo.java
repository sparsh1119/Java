import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();

        int count = 0;
        int temp = n;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println("Count : " + count);

        n=temp;
        int sum =0;
        while (n!=0) {
            int digit = n%10;
            int product = 1;
            for(int i =1; i<=count; i++){
                    product*=digit;
            }
            sum += product;
            n/=10;
        }

        if(temp == sum) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong Number");


    }
}
