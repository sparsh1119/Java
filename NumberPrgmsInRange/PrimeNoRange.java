import java.util.Scanner;

public class PrimeNoRange {

    public static void highestPrimeInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isPrime(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestPrimeInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isPrime(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternatePrimesInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isPrime(i)) {
                count++;
                if (count % 2 == 0) {
                    System.out.print(i+" ");
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int st = scn.nextInt();
        int end = scn.nextInt();

        System.out.println("Highest Prime In Range");
        highestPrimeInRange(st, end);
        System.out.println();
        System.out.println("Second Highest Prime In Range");
        secondHighestPrimeInRange(st, end);
        System.out.println();
        System.out.println("Alternate prime number");
        printAlternatePrimesInRange(st, end);
        
    }
}
