package com.tgt.igniteplus;
import javax.swing.*;
import java.util.*;
public class RemoveHyphen {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String string1 = in.nextLine();
        char[] charArrayOfString = string1.toCharArray();
        char[] result = new char[charArrayOfString.length];
        int j = 0;
        for (int i = 0; i < string1.length(); i++)
            if( charArrayOfString[i] == '-' && Character.isDigit(string1.charAt(i-1)) && Character.isDigit(string1.charAt(i+1)));
            else
                result[j++] = charArrayOfString[i];
        System.out.println(result);
    }
}
