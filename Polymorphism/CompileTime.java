/* A software company is developing a Calculator module for a learning application. The module should support addition operations for different types and numbers of inputs.

The developer designs a class Calculator with the following features:

A public method to add two integers.
A protected method to add three integers.
A private method to add two decimal numbers.
A public method that internally calls the private method to display the result.

The system demonstrates method overloading to perform different addition operations using the same method name.*/

class CalCulator {
public int add(int a, int b) {
return a+b;
}
protected int add(int a, int b, int c) {
return a+b+c;
}
private double add(double a, double b) {
return a+b;
}
public double result(double a, double b) {
double sum = add(a,b);
return sum;
}
}

public class CompileTime {
public static void main(String[] args) {
CalCulator obj = new CalCulator ();
System.out.println("The sum of 5 and 10 is " + obj.add(5, 10));
System.out.println("The sum of 5, 10 and 15 is " + obj.add(5, 10, 15));
System.out.println("The sum of 5.10 and 10.5 is " + obj.result(5.10, 10.5));
}
}