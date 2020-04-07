package com.tgt.igniteplus;
import java.util.*;
public class LengthOfString {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String string1 = in.nextLine();
        char[] ArrayOfString = string1.toCharArray();
        int length = 0;
        for( char c : ArrayOfString)
             length++;
        System.out.println("Length of given string is "+length);
        //inbuilt function length() could be used
    }
}
