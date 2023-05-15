import java.util.Scanner;
import java.util.*;

public class Subsystem {
            public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int count=0;
            while(a>0){
                if((a&1)==1){
                    count++;
                    a=a>>1;
                }
            }
                System.out.println(count);
                    }
        ////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        switch (a){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            default:
//                System.out.println("invalid");


//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a == 1) {
//            int marks = sc.nextInt();
//            if (marks >= 90) {
//                System.out.println("Excellent");
//            } else if (60 <= marks && marks<90)  {
//                System.out.println("great");
//            } else {
//                System.out.println("Good");
//            }
//        } else if (a == 0) {
//            System.out.println("stop");
//        }


//        //***** Inverted & Rotated Half Pyramid ***** //
//
//        int n = 4;
//
//        for(int i=n; i>=1; i--) {
//            for(int j=1; j<i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=0; j<=n-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

//        //--- Rhombus ---//
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();

//        int n=3;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=n;j++){
//                int sum = i+j;
//                if (sum%2==0){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//            }
    }