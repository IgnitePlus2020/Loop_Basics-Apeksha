package com.tgt.igniteplus;
import java.util.Scanner;
public class EmptyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String string1 = in.nextLine();
        char[] ArrayOfString = string1.toCharArray();
        int length = 0;
        for (char c : ArrayOfString)
            length++;
        if(length == 0)
            System.out.println("Given string is empty");
        else
            System.out.println("Given string is not empty");
        //inbuilt function isEmpty() could be used
    }
}
