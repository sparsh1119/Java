import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n= scn.nextInt();

        if(n<=1) System.out.println("Not a Prime Number");

        boolean flag  = true;
        for(int i = 2; i<=n/2; i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
