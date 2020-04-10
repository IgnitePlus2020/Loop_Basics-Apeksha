package com.tgt.igniteplus;
import java.sql.SQLOutput;
import java.util.*;
public class ImmutableString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String string1 = in.nextLine();
        String start = "Welcome\n"+ string1;
        System.out.println(start);
        string1 = string1 +" Thank you";
        System.out.println(string1);

    }
}
