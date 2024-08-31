import java.util.Scanner;

public class NeonNum {

    public static boolean isNeonNumber(int n){
        int sq = n*n;
        int sqSum = 0;

        while (sq!=0) {
            int d = sq%10;
            sqSum += d;
            sq/=10;
        }
        if(n==sqSum) return true;
        else return false;
    }

    public static void printNeonNumbersInRange(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isNeonNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void highestNeonNumberInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isNeonNumber(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestNeonNumberInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isNeonNumber(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternateNeonNumbersInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isNeonNumber(i)) {
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

        System.out.println("Neon Numbers In Range:");
        printNeonNumbersInRange(st, end);

        System.out.println("\nHighest Neon Number In Range:");
        highestNeonNumberInRange(st, end);

        System.out.println("\nSecond Highest Neon Number In Range:");
        secondHighestNeonNumberInRange(st, end);

        System.out.println("\nAlternate Neon Numbers In Range:");
        printAlternateNeonNumbersInRange(st, end);
    }
}

