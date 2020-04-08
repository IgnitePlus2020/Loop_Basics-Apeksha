package com.tgt.igniteplus;
import java.util.*;
public class CompareString {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String string1 = in.nextLine();
        System.out.println("Enter the second string");
        String string2 = in.nextLine();
        System.out.println("Using compareTo in-built function ");
        System.out.println(string1.compareTo(string2));
        System.out.println("Using equals in-built function, also ignoring case");
        System.out.println(string1.equalsIgnoreCase(string2));
    }
}
