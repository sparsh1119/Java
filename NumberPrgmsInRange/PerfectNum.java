import java.util.Scanner;

public class PerfectNum {

    public static boolean isPerfectNumber(int n){
        int sum = 0;

        for(int i = 1 ; i<=n/2 ;i++){
            if(n%i==0) sum+=i;
        }
        if(sum == n) return true;
        else return false;
    }

    public static void printPerfectNumbersInRange(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void highestPerfectNumberInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isPerfectNumber(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestPerfectNumberInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isPerfectNumber(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternatePerfectNumbersInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isPerfectNumber(i)) {
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

        System.out.println("Perfect Numbers In Range:");
        printPerfectNumbersInRange(st, end);

        System.out.println("\nHighest Perfect Number In Range:");
        highestPerfectNumberInRange(st, end);

        System.out.println("\nSecond Highest Perfect Number In Range:");
        secondHighestPerfectNumberInRange(st, end);

        System.out.println("\nAlternate Perfect Numbers In Range:");
        printAlternatePerfectNumbersInRange(st, end);
    }
}

