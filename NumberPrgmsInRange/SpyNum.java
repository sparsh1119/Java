import java.util.Scanner;

public class SpyNum {

    public static boolean isSpyNumber(int n){
        int sum =0;
        int product = 1;

        while(n!=0){
            int digit = n%10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        if (sum == product) {
            return true;
        }
        else{
            return false;
        } 
    }

    public static void printSpyNumbersInRange(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isSpyNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void highestSpyNumberInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isSpyNumber(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestSpyNumberInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isSpyNumber(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternateSpyNumbersInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isSpyNumber(i)) {
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

        System.out.println("Spy Numbers In Range:");
        printSpyNumbersInRange(st, end);

        System.out.println("\nHighest Spy Number In Range:");
        highestSpyNumberInRange(st, end);

        System.out.println("\nSecond Highest Spy Number In Range:");
        secondHighestSpyNumberInRange(st, end);

        System.out.println("\nAlternate Spy Numbers In Range:");
        printAlternateSpyNumbersInRange(st, end);
    }
}

