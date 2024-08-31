import java.util.Scanner;

public class addEvenDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();
        int sum =0;

        while(n != 0){
            int digit = n%10;
            n = n/10;
            if(digit%2 == 0){
                sum += digit;
            }
        }

        System.out.println(sum);
    }
}
