import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();

        for(int i = 1 ; i<=10 ; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
