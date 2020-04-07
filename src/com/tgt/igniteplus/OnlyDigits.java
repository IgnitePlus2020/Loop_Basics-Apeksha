package com.tgt.igniteplus;
import java.util.*;
public class OnlyDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String string1 = in.nextLine();
        int countDigit = 0, countChar = 0;
            for (int i = 0; i < string1.length(); i++)
                if (Character.isDigit(string1.charAt(i)))
                    countDigit++;
                else
                    countChar++;
            if (countChar == 0)
                System.out.println("String contains just digits \nNumber of digits = "+countDigit);
            else
                System.out.println("String does not contain just digits");
    }
}
