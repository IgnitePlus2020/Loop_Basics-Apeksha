package com.tgt.igniteplus;
import java.util.*;
public class IfElseIf
{
    public static void main(String []args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the score in terms of percentage");
        double score = in.nextDouble();
        if (score >= 90)
            System.out.println("Distinction");
        else if (score >= 75)
            System.out.println("First class");
        else if (score >= 65)
            System.out.println("Second class");
        else if (score >= 45)
            System.out.println("Third class");
        else if(score >= 30)
            System.out.println("Just pass");
        else
            System.out.println("Fail");
    }
}
