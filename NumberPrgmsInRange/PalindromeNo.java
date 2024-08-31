import java.util.Scanner;

public class PalindromeNo {

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return originalNum == reverse;
    }

    public static void printPalindromeNumbersInRange(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void highestPalindromeNumberInRange(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isPalindrome(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void secondHighestPalindromeNumberInRange(int st, int end) {
        int count = 0;
        for (int i = end; i >= st; i--) {
            if (isPalindrome(i)) {
                count++;
                if (count == 2) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void printAlternatePalindromeNumbersInRange(int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if (isPalindrome(i)) {
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

        System.out.println("Palindrome Numbers In Range:");
        printPalindromeNumbersInRange(st, end);

        System.out.println("\nHighest Palindrome Number In Range:");
        highestPalindromeNumberInRange(st, end);

        System.out.println("\nSecond Highest Palindrome Number In Range:");
        secondHighestPalindromeNumberInRange(st, end);

        System.out.println("\nAlternate Palindrome Numbers In Range:");
        printAlternatePalindromeNumbersInRange(st, end);
    }
}

