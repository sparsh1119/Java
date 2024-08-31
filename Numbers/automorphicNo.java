import java.util.Scanner;

public class automorphicNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scn.nextInt();

        int sq = n*n;
        boolean flag = true;
        while(n!=0){
            if(n%10 != sq%10){
                flag = false;
                break;
            }
            n/=10;
            sq/=10;
        }

        if (flag) {
            System.out.println("Automorpic Number");
        }else{
            System.out.println("Not a automorphic number");
        }
    }
}
