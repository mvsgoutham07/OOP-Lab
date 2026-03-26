/* A software company is developing an Advanced Calculator system using Java. The system is designed using inheritance and runtime polymorphism.

A base class Calculator contains:
A public method add(int a, int b) to perform addition.
A protected method display() to show a message.
A private method show() that is accessed using a public method accessPrivate().
A derived class AdvancedCalculator extends Calculator and:
Overrides the add() method to modify its behavior.
Overrides the display() method.
Defines its own show() method, which is not an overridden method.

The main program creates objects of both classes and also uses a parent class reference to a child class object to demonstrate runtime polymorphism. */

class Calculator {
public int add(int a, int b) {
return a+b;
}
protected void display() {
System.out.println("Two integers have been added.");
}
private void show() {
System.out.println("This is Calculator.");
}
public void accessPrivate() {
show();
}
}

class AdvancedCalculator extends Calculator {
@Override
public int add(int a, int b) {
return a+b+10;
} 
@Override
protected void display() {
System.out.println("The sum of two integers has been incremented by 10.");
}
public void show() {
System.out.println("This is Advanced Calculator.");
}
}

public class RunTime {
public static void main(String[] args) {
Calculator calc = new Calculator();
AdvancedCalculator adv = new AdvancedCalculator();

System.out.println("The sum of 5 and 15 is " + calc.add(5, 15));
calc.display();
calc.accessPrivate();

System.out.println("The sum of 5 and 15 when incremented by 10 is " + adv.add(5, 15));
adv.display();
adv.show();
}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        