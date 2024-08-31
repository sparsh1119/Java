import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = scn.nextInt();

        printFibonacci(n);

        scn.close();
    }
}

