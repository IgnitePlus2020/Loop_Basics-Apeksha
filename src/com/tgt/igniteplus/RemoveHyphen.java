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
            if( charArrayOfString[i] == '-' && charArrayOfString[i-1] < 65 && charArrayOfString[i+1] < 65);
            else
                result[j++] = charArrayOfString[i];
        System.out.println(result);
    }
}
