import java.util.Scanner;

public class ArmstrongNum {

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        int power = 0;

        while (temp > 0) {
            power++;
            temp /= 10;
        }

        temp = n;

        while (temp > 0) {
            int prod = 1;
            int digit = temp % 10;
            for (int i = 1; i <= power; i++) {
                prod *= digit;
            }
            sum += prod;
            temp /= 10;
        }

        return sum == n;
    }

    public static void printArmstrongNumbersInRange(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void highestArmstrongNumberInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isArmstrong(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestArmstrongNumberInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isArmstrong(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternateArmstrongNumbersInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isArmstrong(i)) {
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

        System.out.println("Armstrong Numbers In Range:");
        printArmstrongNumbersInRange(st, end);

        System.out.println("\nHighest Armstrong Number In Range:");
        highestArmstrongNumberInRange(st, end);

        System.out.println("\nSecond Highest Armstrong Number In Range:");
        secondHighestArmstrongNumberInRange(st, end);

        System.out.println("\nAlternate Armstrong Numbers In Range:");
        printAlternateArmstrongNumbersInRange(st, end);
    }
}

