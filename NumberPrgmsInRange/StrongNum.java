import java.util.Scanner;

public class StrongNum {

    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            int prod = 1;
            for (int i = 1; i <= digit; i++) {
                prod *= i;
            }
            sum += prod;
            temp /= 10;
        }

        return sum == n;
    }

    public static void printStrongNumbersInRange(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void highestStrongNumberInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isStrong(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestStrongNumberInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isStrong(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternateStrongNumbersInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isStrong(i)) {
                count++;
                if (count % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the starting and ending range:");
        int st = scn.nextInt();
        int end = scn.nextInt();

        System.out.println("Strong Numbers In Range:");
        printStrongNumbersInRange(st, end);

        System.out.println("\nHighest Strong Number In Range:");
        highestStrongNumberInRange(st, end);

        System.out.println("\nSecond Highest Strong Number In Range:");
        secondHighestStrongNumberInRange(st, end);
        
        System.out.println("\nAlternate Strong Numbers In Range:");
        printAlternateStrongNumbersInRange(st, end);
    }
}

