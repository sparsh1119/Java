// public class practice {
//     public static void main(String[] args) {
//         for(int i = 1 ; i<=10 ; i++){
//             System.out.println(i*i);
//         }
//     }
// }

import java.util.Scanner;

/**
 * practice
 */
// public class practice {

//     public static void main(String[] args) {
//         System.out.print("Enter the number to find the factors of:");
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1 ; i<=n ; i++){
//             if(n%i==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// wap to print a number which is divisible by 2 and 6 in give range 1-100

/**
 * practice
 */
// public class practice {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1 ; i<=100 ; i++){
//             if(i%2 == 0 && i%6==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


//Wap sum of factor in a given number

/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner data = new Scanner(System.in);
        int n = data.nextInt();

        int sum = 0;

        for(int i = 1 ; i<= n ; i++){
            if(n%i==0){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
