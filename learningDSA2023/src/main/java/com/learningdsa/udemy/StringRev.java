package com.learningdsa.udemy;

public class StringRev {

    public String rev(String str)
    {
        if(str.length()==1)
        {
            return str.charAt(0)+"";
        }

        return str.charAt(str.length()-1)+rev(str.substring(0,str.length()-1));
    }
    public  boolean isPalindrome(String s)
    {
        // TODO
        if(s.length()==1)
        {
            return true;
        }
        else
            return (s.charAt(0)==s.charAt(s.length()-1) && isPalindrome(s.substring(1,s.length()-1)));
    }
}
