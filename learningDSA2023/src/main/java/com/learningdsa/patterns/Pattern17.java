package com.learningdsa.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
//        int val=1;
//        for(int i=1;i<=2*n;i++)
//        {
//
//            for(int j=1;j<=val;j++)
//            {
//                System.out.print("*\t");
//
//            }
//            if(i<n)
//                val++;
//            else
//                val--;
//
//            System.out.println();
//        }
        int st=1;
        int os=n/2;
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=os;j++)
         {
             if(i==((n/2)+1))
                 System.out.print("*\t");
             else
             System.out.print("\t");
         }
         for(int j=1;j<=st;j++) {
             System.out.print("*\t");
         }
         if(i<=n/2)
         {
             st++;

         }
         else
         {
             st--;

         }
         System.out.println();
     }
    }
}
