import java.util.Scanner;

public class HappyNum {

    public static int digitSquareSum(int n){
        int sum =0;
        while (n!=0) {
            int digit = n%10;
            sum += digit*digit;
            n/=10;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        int m=n;
        while (m!=1 && m!=4) {
            m=digitSquareSum(m);
        }
        if(m==1) return true;
        else return false;
    }

    public static int numSquareSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void printHappyNumbersInRange(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void highestHappyNumberInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isHappy(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestHappyNumberInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isHappy(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternateHappyNumbersInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isHappy(i)) {
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

        System.out.println("Happy Numbers In Range:");
        printHappyNumbersInRange(st, end);

        System.out.println("\nHighest Happy Number In Range:");
        highestHappyNumberInRange(st, end);

        System.out.println("\nSecond Highest Happy Number In Range:");
        secondHighestHappyNumberInRange(st, end);

        System.out.println("\nAlternate Happy Numbers In Range:");
        printAlternateHappyNumbersInRange(st, end);
    }
}

