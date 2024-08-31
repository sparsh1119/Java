//Enter 3 numbers from the user & make a function to print their average.

// import java.util.Scanner;

// public class function {

//     public static int average(int a, int b , int c){
//         return ((a+b+c)/3);
//     }
//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int a =m data.nextInt();
//         int b = data.nextInt();
//         int c = data.nextInt();

//         System.out.println(average(a, b, c));

//     }
// }

//Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.Scanner;

// /**
//  * function
//  */
// public class function {

//     public static int sumOdd(int n){
//         int sum = 0;
//         for(int i = 1 ; i<=n ; i++){
//             if(i%2!=0){
//                 sum += i;
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         System.out.println(sumOdd(n));


//     }
// }

//Write a function which takes in 2 numbers and returns the greater of those two.

// import java.util.Scanner;

// /**
//  * function
//  */
// public class function {

//     public static int max(int a , int b){
//         if(a>b){
//             return a;
//         }else{
//             return b;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int a = data.nextInt(), b = data.nextInt();

//         System.out.println(max(a,b));
//     }
// }


// //Write a function that takes in the radius as input and returns the circumference of a circle.

// import java.util.Scanner;

// /**
//  * function
//  */
// public class function {

//     public static double circumference(int r){
//         return 2*3.14*r;
//     }
//      public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int r = data.nextInt();

//         System.out.println(circumference(r));
//      }
// }

// Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.

import java.util.Scanner;

/**
 * function
 */
// public class function {

//     public static boolean eligible(int age){
//         if(age>18) return true;
        
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int age = data.nextInt();

//         System.out.println(eligible(age));
//     }
// }



// Write an infinite loop using do while condition.
/**
 * function
 */
// public class function {

//     public static void main(String[] args) {
//          do{
//             System.out.println("This loop will run infinte");
//          }while(true);
//     }
// }

// Write a program to enter the numbers till the user wants and at the
// end it should display the count of positive, negative and zeros entered. 
/**
 * function
 */
// public class function {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int positive =0 , negative=0, zeros=0;
//         char choice;
//         do {
//             System.out.println("Enter the number:");
//             int n = data.nextInt();
//             if(n>0){
//                 positive++;
//             }
//             else if(n<0){
//                 negative++;
//             }
//             else{
//                 zeros++;
//             }
//             System.out.println("Do you want to continue?(y/n)");
//             choice = data.next().charAt(0);
//         } while (choice =='y' || choice =='Y');

//         System.out.println("Total Positive Number : " + positive);
//         System.out.println("Total negative Number : " + negative);
//         System.out.println("Total Zeros: "+ zeros);
//     }
// }

// Two numbers are entered by the user, x and n. Write a function to find the value of one 
//number raised to the power of another i.e. xn.
/**
 * function
 */
// public class function {

//     public static long power(long x , int n){
//         long ans =1;
//         for(int i = 1; i<=n ; i++){
//             ans *= x;
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         long x = data.nextInt();
//         int n = data.nextInt();
        
//         System.out.println(power(x,n));
//     }
// }

// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
/**
 * function
 */
// public class function {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int a = data.nextInt();
//         int b = data.nextInt();

//     }
//}

// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacc i series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)

/**
 * function
 */
public class function {

    public static void main(String[] args) {
        int i=0;
        for(System.out.println("hello"); i<=5;System.out.println("world")){
            System.out.println(i);
            i++;
        }
    }
}


