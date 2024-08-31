import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scn.nextInt();

        int sum = 0;
        for(int i = 1; i <=n/2; i++){
            if(n % i == 0){
                System.out.println(i);
                sum += i;
            }
        }

        if(sum == n){
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect");
        }
    }
}

