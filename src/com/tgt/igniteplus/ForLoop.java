package com.tgt.igniteplus;
import java.util.*;
public class ForLoop
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter any number ");
        int n = in.nextInt();
        for(int i = n; i > 0 ; i--)
        {
            for(int j = i; j > 0 ; j--)
                System.out.print("* ");
            System.out.println();
        }

    }
}
