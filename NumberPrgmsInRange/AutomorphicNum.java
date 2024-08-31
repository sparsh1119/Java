import java.util.Scanner;

public class AutomorphicNum {

    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        while (n != 0) {
            if (n % 10 != sq % 10) {
                return false;
            }
            n /= 10;
            sq /= 10;
        }
        return true;
    }

    public static void printAutomorphicNumbersInRange(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isAutomorphic(i)) {
                System.out.print(i + " ");
            }
        } 
    }

    public static void highestAutomorphicNumberInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isAutomorphic(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestAutomorphicNumberInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isAutomorphic(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternateAutomorphicNumbersInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isAutomorphic(i)) {
                count++;
                if (count % 2 != 0) {
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

        System.out.println("Automorphic Numbers In Range:");
        printAutomorphicNumbersInRange(st, end);

        System.out.println("\nHighest Automorphic Number In Range:");
        highestAutomorphicNumberInRange(st, end);

        System.out.println("\nSecond Highest Automorphic Number In Range:");
        secondHighestAutomorphicNumberInRange(st, end);
        
        System.out.println("\nAlternate Automorphic Numbers In Range:");
        printAlternateAutomorphicNumbersInRange(st, end);
    }
}
