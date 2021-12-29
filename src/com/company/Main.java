package com.company;

class  ArithmeticOperation
{
    int x = 10;
    int y=20;
}

class Addition  extends ArithmeticOperation
{

    void display()
    {
        System.out.println("The  value addition  is:" +(x+y));
    }
}

class subtraction extends ArithmeticOperation
{

    void display()
    {
        System.out.println("The value subtraction is:" + (x-y));
    }

}
class Multiplicatin extends ArithmeticOperation {

    void display()
    {
        System.out.println("The value  multiplication is:" + (x * y));
    }

}
public class Main {

    public static void main(String args[]) {
        Addition addition = new Addition();
        subtraction subtraction = new subtraction();
        Multiplicatin multiplicatin = new Multiplicatin();
        addition.display();
        subtraction.display();
        multiplicatin.display();
    }
}
