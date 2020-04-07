package com.tgt.igniteplus;
import java.util.*;
public class RemoveOccurences {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String");
        String string1 = in.nextLine();
        int j;
        char []charArrayOfString = string1.toCharArray();
        char []result = new char[string1.length()];
        for (int i = j = 0; i < string1.length(); i++)
        {
            if (charArrayOfString[i] != 't' && charArrayOfString[i] != 'T')
                result[j++] = charArrayOfString[i];
        }
        System.out.println(result);
    }
}
