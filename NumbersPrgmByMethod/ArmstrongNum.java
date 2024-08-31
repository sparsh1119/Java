import java.util.Scanner;

public class ArmstrongNum {

    public static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        int power = 0;
        
        while (temp>0) {
            power++;
            temp/=10;
        }

        temp =n;

        while (temp>0) {
            int prod =1;
            int digit = temp%10;
            for (int i = 1; i <=power; i++) {
                prod*=digit;
            }
            sum+=prod;
            temp /=10;
        }

        if(sum == n) return true;
        else return false;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scn.nextInt();

        System.out.println(isArmstrong(n));

    }
}
