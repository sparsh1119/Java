import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int n = data.nextInt();

        for(int i = 0 ; i<=n ; i++){
            for(int j = 1 ; j<= n-i ; j++){
                System.out.print(" ");
            }

            int p = 1;
            for(int j = 0; j<= i ; j++){
                System.out.print(p+" ");
                p = p*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}