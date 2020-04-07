package com.tgt.igniteplus;
import java.util.*;
public class DoWhileLoop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int y = 0;
        do
        {
           int factorial = 1;
           System.out.println("Enter any number to find the factorial");
           int n = in.nextInt();
           for( int i = n; i >1 ;i--)
               factorial = factorial*i;
           System.out.println("Factorial = " +factorial );
           System.out.println("Press 1 to continue");
           y = in.nextInt();
        }while(y == 1);
    }
}
