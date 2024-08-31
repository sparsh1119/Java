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

    public static void printFibonacciInRange(int st, int end) {
        int a = 0, b = 1;

        while (a <= end) {
            if (a >= st) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void highestFibonacciInRange(int st, int end) {
        int a = 0, b = 1, highest = -1;

        while (a <= end) {
            if (a >= st) {
                highest = a;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        if (highest != -1) {
            System.out.print(highest);
        }
    }

    public static void printAlternateFibonacci(int n) {
        int a = 0, b = 1;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (count % 2 != 0) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number of terms:");
        int n = scn.nextInt();
        System.out.println("Fibonacci Series:");
        printFibonacci(n);
        
        System.out.println("\n\nEnter the starting and ending range:");
        int st = scn.nextInt();
        int end = scn.nextInt();

        System.out.println("Fibonacci Numbers In Range:");
        printFibonacciInRange(st, end);

        System.out.println("\nHighest Fibonacci Number In Range:");
        highestFibonacciInRange(st, end);

        System.out.println("\nAlternate Fibonacci Numbers:");
        printAlternateFibonacci(n);

        scn.close();
    }
}

