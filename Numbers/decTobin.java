import java.util.Scanner;

public class decTobin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scn.nextInt();

        int ans =0;
        int power =1;

        while (n!=0) {
            int digit = n%2;
            ans = ans + (digit*power);
            power*=10;
            n/=2;
        }
        System.out.println(ans);
    }
}
