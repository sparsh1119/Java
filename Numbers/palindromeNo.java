import java.util.Scanner;

public class palindromeNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();
        int temp = n;
        int reverse = 0;

        while(n!=0){
            int digit = n%10;
            reverse = reverse*10 +digit;
            n/=10;
        }
        if (temp == reverse) {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome number");
        }
    }
}
