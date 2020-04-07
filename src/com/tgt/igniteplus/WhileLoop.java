package com.tgt.igniteplus;
import java.util.*;
public class WhileLoop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to find if its reverse");
        int n = in.nextInt();
        int reverse =0;
        while(n>0)
        {
            int lastDigit = n%10;
            n = n/10;
            reverse = (reverse*10)+lastDigit;
        }
        System.out.println("Reverse number is " +reverse);
    }
}
