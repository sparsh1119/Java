import java.util.Scanner;

public class StrongNum {

    public static boolean isStrong(int n){
        int sum =0;
        int temp =n;

        while(temp!=0){
            int digit = temp%10;
            int prod = 1;
            for(int i =1; i<=digit;i++){
                prod*=i;
            }
            sum +=prod;
            temp/=10;
        }

        if(sum == n) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scn.nextInt();

        System.out.println(isStrong(n));
    }
}
