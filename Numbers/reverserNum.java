import java.util.Scanner;

public class reverserNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();

        String str = "";

        while (n!=0) {
            int digit = n%10;
            str += digit;
            n /=10;
        }
        System.out.println(str);
    }
}
