import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scn.nextInt();

        int factorial = 1;
        while (n!=1) {
            factorial *= n;
            n--;
        }

        System.out.println("Factorial :"+factorial);
    }
}
