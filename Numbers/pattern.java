import java.util.*;

// 1
// public class pattern {
// public static void main(String[] args) {
// // int n = 4, m = 5;
// Scanner myobj = new Scanner(System.in);
// int n = myobj.nextInt();
// int m = myobj.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= m; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// }
// }

// 2
// public class pattern {
// public static void main(String[] args) {
// // int n = 4, m = 5;
// Scanner myobj = new Scanner(System.in);
// int n = myobj.nextInt();
// int m = myobj.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= m; j++) {
// if (i == 1 || i == n || j == 1 || j == m)
// System.out.print("*");
// else
// System.out.print(" ");
// }
// System.out.println();
// }
// }
// }

// 3
/**
 * pattern
 */
// public class pattern {
// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

/**
 * pattern 4
 */
// public class pattern {

// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

/**
 * pattern 5
 * //
 */
// public class pattern {

// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// for(int i = 1 ; i<=n ; i++){
// for(int j =1 ; j<)
// }
// }
// }c

/**
 * pattern 6
 */
// public class pattern {

// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.err.print("*");
// }
// System.out.println();
// }
// }
// }

/**
 * pattern 7
 */
// public class pattern {

// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }

// System.out.println();
// }
// }
// }

/**
 * pattern 8
 */
// public class pattern {

// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

/**
 * pattern 9
 */
// public class pattern {

// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }
// System.out.println();
// }
// }
// }

/**
 * pattern 10
 */
// public class pattern {

// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

/**
 * pattern 11
 */
// public class pattern {

// public static void main(String[] args) {
// Scanner data = new Scanner(System.in);
// int n = data.nextInt();

// int p = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(p + " ");
// p++;
// }
// System.out.println();
// }
// }

// }

/**
 * pattern 12
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if ((i + j) % 2 == 0) {
//                     System.out.print(1 + " ");
//                 } else {
//                     System.out.print(0 + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern 13
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1; i<= n ; i++){
//             for(int j = 1; j<= n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=n ; j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

/**
 * pattern 14
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1; i<=n ; i++){
//             for(int j =1 ; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=i ; j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


/**
 * pattern 15
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1; i<=n ; i++){
//             for(int j =1 ; j<= n-i ; j++){
//                 System.out.print(" ");
//             }
//             for(int j =i ; j >=1 ; j-- ){
//                 System.out.print(j);
//             }
//             for(int j =2 ; j<= i ; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern 16 butterfly
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1 ; i<= n ; i++){
//             for(int j = 1 ; j<= i; j++){
//                 System.out.print("* ");
//             }
//             for(int j = 1; j<=2*(n-i) ; j++){
//                 System.out.print("  ");
//             }
//             for(int j = 1 ; j<=i ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i = n ; i>=1; i--){
//             for(int j = 1 ; j<= i; j++){
//                 System.out.print("* ");
//             }
//             for(int j = 1; j<=2*(n-i) ; j++){
//                 System.out.print("  ");
//             }
//             for(int j = 1 ; j<=i ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern 17 rombus
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1 ; i<=n ; i++){
//             for(int j = 1 ; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for( int j = 1 ; j<= 2*i-1 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = n ; i>=1 ; i--){
//             for(int j = 1 ; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for( int j = 1 ; j<= 2*i-1 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


/**
 * pattern 18 hollow Butterfly
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i =1;i<=n ; i++){
//             for(int j= 1 ; j<=i ; j++){
//                 if(j==i || j ==1)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j<= 2*(n-i) ; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i ; j++){
//                 if(j==i || j ==1)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         for(int i =n;i>=1 ; i--){
//             for(int j= 1 ; j<=i ; j++){
//                 if(j==i || j ==1)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j<= 2*(n-i) ; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i ; j++){
//                 if(j==i || j ==1)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }


/**
 * pattern 19 hollow rombus
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1 ; i<= n ; i++){
//             for(int j = 1 ; j<=n-i ; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j<=n ;j++){
                
//                 if(j==1 || j== n || i==1 || i==n ){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//                 System.out.println();
//         }
//     }
// }


/**
 * pattern 20 pascal triangle
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 0 ; i<=n ; i++){
//             for(int j = 1 ; j<= n-i ; j++){
//                 System.out.print(" ");
//             }

//             int p = 1;
//             for(int j = 0; j<= i ; j++){
//                 System.out.print(p+" ");
//                 p = p*(i-j)/(j+1);
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern 21
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1 ; i<=n ; i++){

//             for(int j = 1 ; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j =1 ; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


/**
 * pattern 22
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 1 ; i<=n ; i++){
//             for(int j = n ; j>=i ; j--){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern S 
 */
// public class pattern {

//     public static void main(String[] args) {
//         for(int r=1 ; r<=7 ; r++){
//             for(int c=1 ; c<=5 ; c++){
//                 if((r== 1 || r==4 || r==7) ||(r<4 &&c==1) || (r>4 && c==5)){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// public class pattern {

//     public static void main(String[] args) {
//         for(int r=1 ; r<=7 ; r++){
//             for(int c=1 ; c<=5 ; c++){
//                 if((r== 1 || r==4 ||c==1) ||(r<4 &&c>4) ){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// public class pattern {

//     public static void main(String[] args) {
//         for(int r=1 ; r<=7 ; r++){
//             for(int c=1 ; c<=5 ; c++){
//                 if((r== 1 || r==4 ||c==1 || c==5)){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         for(int r=1 ; r<=7 ; r++){
//             for(int c=1 ; c<=5 ; c++){
//                 if((r== 1 || r==4 ||c==1) ||(r<4 &&c>4) ||((r>=5 && c>=3) && r+c==8 || r+c==10 || r+c==12)){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 } 
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = scn.nextInt();

//         int sum  = 0;
//         int product = 1;

//         while (n!=0) {
//             sum = sum + n%10;
//             product = product*n%10;
//             n= n/10;
//         }

//         if(sum == product) System.out.println("spy");
//         else System.out.println("notspy");

//     }
// }


/**
 * pattern
11111
2222
333
44
5
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         for(int i = 1 ;i<=n;i++){
//             for(int j = n ;j>=i ; j--){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
1
2 3
4 5 6
7 8 9 10
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         int count =1;
//         for(int i =1 ; i<=n ; i++){        
//             for(int j = 1 ; j<= i ; j++){
//                 System.out.print(count++ +" ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
1 2 3 4 5
5 4 3 2 1
1 2 3 4 5
5 4 3 2 1
1 2 3 4 5
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         for(int i =1 ; i<= n ; i++){

//             if(i%2!=0){
//                 for(int j = 1 ; j<=n ; j++){
//                 System.out.print(j+" ");
//             }
//         }else{
//             for(int j = n ; j>=1 ; j--){
//                 System.out.print(j+" ");
//             }
//         }

//             System.out.println();
//         }
//     }
// }


/**
 * pattern
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn= new Scanner(System.in);
//         int n = scn.nextInt();
//         int count = 1; 

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 for (int j = 0; j < n; j++) {
//                     System.out.print(count + " ");
//                     count++;
//                 }
//             } else {
//                 int end = count + n - 1;
//                 for (int j = end; j >= count; j--) {
//                     System.out.print(j + " ");
//                 }
//                 count = end + 1;
//             }
//             System.out.println();
//         }
    
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt(); 
//         int count = 1;

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 for (int j = 0; j < i; j++) {
//                     System.out.print(count++ + " ");
//                 }
//             } else {
//                 int start = count + i - 1;
//                 for (int j = start; j >= count; j--) {
//                     System.out.print(j + " ");
//                 }
//                 count += i;
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         for(int i = 1; i<=n; i++){
//             if(i%2 !=0){
//                 int x=((i-1)*n+1);
//                 for(int j=1; j<=n;j++){
//                     System.out.print(x+"\t");
//                     x++;
//                 }
//             }else{
//                 int x = i*n;
//                 for(int j =1; j<=n ; j++){
//                     System.out.print(x+"\t");
//                     x--;
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
5*4*3*2*1
5*4*3*2
5*4*3
5*4
5
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j =n ; j>=i; j--){
//                 System.out.print(j);
//                 if(i<n && j>i)
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         for(int i = 1; i<=n ; i++){
//             for(int j = 1 ; j<= n-i ; j++){
//                 System.out.print("  ");
//             }
//             for(int j =1 ; j<=2*i-1;j++){
//                 if(j==1||j==2*i-1||i==n)
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//         public static void main(String[] args) {
//             Scanner data = new Scanner(System.in);
//             int n = data.nextInt();
    
//             for(int i = 1 ; i<=n ; i++){
//                 for(int j = 1 ; j<=n-i; j++){
//                     System.out.print(" ");
//                 }
//                 for( int j = 1 ; j<= 2*i-1 ; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//             for(int i = n ; i>=1 ; i--){
//                 for(int j = 1 ; j<=n-i; j++){
//                     System.out.print(" ");
//                 }
//                 for( int j = 1 ; j<= 2*i-1 ; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int m = n/2+1;

//         for(int i =1 ; i<=m;i++){
//             for(int j =1; j<= m-i ;j++){
//                 System.out.print("  ");
//             }
//             for(int j =1; j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         for(int i =m-1 ; i>=1;i--){
//             for(int j =1; j<= m-i ;j++){
//                 System.out.print("  ");
//             }
//             for(int j =1; j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//pascal Trinangle
// public class pattern {

//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         int n = data.nextInt();

//         for(int i = 0 ; i<=n ; i++){
//             for(int j = 1 ; j<= n-i ; j++){
//                 System.out.print("  ");
//             }

//             int p = 1;
//             for(int j = 0; j<= i ; j++){
//                 System.out.print(p+"   ");
//                 p = p*(i-j)/(j+1);
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         for(int i = 1; i<= n ;i++){
//             for (int j = 1; j <= n; j++) {
//                 if (i==j || i+j==n+1) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         Scanner scn= new Scanner(System.in);
//         int n = scn.nextInt();
//         int count = 1; 

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 for (int j = 0; j < n; j++) {
//                     System.out.print(count + " ");
//                     count++;
//                 }
//             } else {
//                 int end = count + n - 1;
//                 for (int j = end; j >= count; j--) {
//                     System.out.print(j + " ");
//                 }
//                 count = end + 1;
//             }
//             System.out.println();
//         }
    
//     }
// }




/**
 * pattern
 */
public class pattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<i; j++){
                System.out.print("  ");
            }
            for(int j = n-i ; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

