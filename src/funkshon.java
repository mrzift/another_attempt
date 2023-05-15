import java.util.*;
import java.util.Arrays;

//public class funkshon {
//    public static int findProduct(int a, int b){
//        int product = a*b;
//        return product;
//    }
//    public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int a = sc.nextInt();
//        System.out.println("Enter second number");
//        int b = sc.nextInt();
//        int newProduct = findProduct(a,b);
//        System.out.println(newProduct);
//    }
//}

//// Factorial calculator ////

//public class funkshon {
//    public static int factorial(int n){
//        int f=1;
//        for (int i=0; i<n; i++){
//            f = f*(n-i);
//        }
//        return f;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int a = sc.nextInt();
//        int newFactorial = factorial(a);
//        System.out.println(newFactorial);
//    }
//}

//public class funkshon {
//    public static void average(int a, int b, int c){
//        int avg=0;
//        avg=(a+b+c)/3;
//        System.out.print("The average is:" + avg);
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int a = sc.nextInt();
//        System.out.println("Enter second number");
//        int b = sc.nextInt();
//        System.out.println("Enter third number");
//        int c = sc.nextInt();
//        average(a,b,c);
//    }
//}
//public class funkshon {
//    public static void oddNumSum(int n){
//        int sum=0;
//        for (int i=1; i<=n; i++){
//            if(i%2!=0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int n = sc.nextInt();
//        oddNumSum(n);
//    }
//}
//    public class funkshon {
//        public static void power(double x, double n){
//            double power =0;
//            power = Math.pow(x,n);
//            System.out.println(power);
//            return;
//        }
//        public static void main(String args[]){
//            Scanner sc = new Scanner(System.in);
//            double x = sc.nextDouble();
//            double n = sc.nextDouble();
//            power(x,n);
//        }
//}
    public class funkshon {
    public static int posOfRightMostDiffBit(int m, int n) {
        // Your code here
        for (int i=0; i<=32; i++){
            if ((m & (1<<i)) != (n & (1<<i)))
                return i+1;
        }
        return m;
    }
        public static void main(String args[]){
//            int [] arr = {4,3,4,4,4,3,3,6};
//                int temp=0;
//                int count=0;
//                for(int i=0; i< arr.length; i++){
//                    temp = temp^arr[i];
//                }
//                System.out.println(temp);
            int m=52;
            int n=4;
            int smth = posOfRightMostDiffBit(m,n);
            System.out.println(smth);
           }
        }