package com.learningdsa.striver;

public class RomanToInt {
    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(romanToInt(s));
    }
public static int getValue(char ch)
{
    switch (ch)
    {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default:return 0;

    }
}
    private static int romanToInt(String s) {
        int sum =0;
        char next='-';
        if(s.length()==1)
            return getValue(s.charAt(0));
        for( int i=1;i< s.length();i++)
        {
                 char cur=s.charAt(i-1);
                  next=s.charAt(i);
                 if(getValue(cur)<getValue(next))
                 {
                     sum=sum-getValue(cur);
                 }
                 else
                 {
                     sum=sum+getValue(cur);
                 }
        }
        sum+=getValue(next);
        return sum;

    }

}
