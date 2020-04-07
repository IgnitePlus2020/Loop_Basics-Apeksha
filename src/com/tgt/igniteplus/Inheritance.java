package com.tgt.igniteplus;
import java.util.*;
class Inheritance
{
    public void Wheels()
    {
        System.out.println("This vehicle has wheels");
    }
}
class Car extends Inheritance
{

    public static void main(String[] args) {
        Car honda = new Car();
        System.out.println("Has engine");
        honda.Wheels();
    }
}