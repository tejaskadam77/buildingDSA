package com.learningdsa.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st=1;
        int is=2*n-3;
        for(int i=1;i<=n;i++)
        {
            int val =1;
            for(int j=1;j<=st;j++)
            {
                System.out.print(val+"\t");
                val++;
            }
            for(int j=1;j<=is;j++)
            {
                System.out.print("\t");
            }
            if(i==n)
            {
                st--;
                val--;
            }
            for(int j=1;j<=st;j++)
            {
                val--;
                System.out.print(val+"\t");

            }

            st++;
            is=is-2;
            System.out.println();

        }

    }
}
