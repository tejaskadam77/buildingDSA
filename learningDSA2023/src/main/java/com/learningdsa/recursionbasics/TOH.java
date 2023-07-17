package com.learningdsa.recursionbasics;

public class TOH {
    public static void main(String[] args) {
        //a source
        //b dest
        //c auxillary
        toh(3,'a','b','c');
    }

    private static void toh(int i, char a, char b, char c) {
        if(i==0)
            return;
        toh(i-1,a,c,b);
        System.out.println(" move disk "+ i +" from "+ a +" -> "+ b);
        toh(i-1,c,b,a);

    }
}
