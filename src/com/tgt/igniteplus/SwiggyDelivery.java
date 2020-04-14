package com.tgt.igniteplus;
import java.util.*;
public class SwiggyDelivery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO SWIGGY");
        System.out.println("Please enter your area zip code");
        int zipCode = in.nextInt();
        try {
            boolean check = CheckZip(zipCode);
            if (check)
                System.out.println("Delivery available in your area \n" +
                        "Please place your order");
            else
                throw new MyException("Sorry!!!");
        } catch (MyException e) {
            System.out.println("Delivery not available in your area");
            System.out.println(e.getMessage());
        }
    }

    public static boolean CheckZip(int zipCode) {
        int length = String.valueOf(zipCode).length();
        if (length == 6)
            return true;
        return false;
    }
}
    class MyException extends Exception{
        public MyException(String s){
            super(s);
        }
    }
