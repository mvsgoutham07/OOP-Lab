/* An enterprise billing system is structured with a superclass InvoiceProcessor that provides general methods for generating invoices based on customer details and billing amounts. A subclass RetailInvoice extends this class and overrides these methods to apply retail-specific logic, such as discounts or modified output formatting.

The system should demonstrate runtime polymorphism, where a superclass reference points to a subclass object, and the method call is resolved at runtime. Additionally, certain sensitive operations such as internal calculations are implemented as private methods in the superclass, ensuring they cannot be overridden or accessed directly by the subclass.

Write a Java program to:

Define methods in the superclass for invoice generation
Override these methods in the subclass with modified behavior
Use a parent class reference to invoke subclass methods (runtime polymorphism)
Show that private methods are not inherited or overridden but can still be used internally via public methods
Clearly demonstrate how the subclass changes the behavior of the superclass. */


class InvoiceProcessor {
public void generateInvoice(String customerName, double amount) {
double finalAmount = calculateTotal(amount); 
System.out.println("Customer: " + customerName);
System.out.println("Total Amount: " + finalAmount);
}

private double calculateTotal(double amount) {
System.out.println("Calculating total in InvoiceProcessor...");
return amount; 
}
}

class RetailInvoice extends InvoiceProcessor {
@Override
public void generateInvoice(String customerName, double amount) {
double discount = amount * 0.10; 
double finalAmount = amount - discount;

System.out.println("RETAIL INVOICE");
System.out.println("Customer: " + customerName);
System.out.println("Original Amount: " + amount);
System.out.println("Discount: " + discount);
System.out.println("Final Amount: " + finalAmount);
}
}

public class Overriding {
public static void main(String[] args) {
InvoiceProcessor inv = new RetailInvoice();
inv.generateInvoice("Virat Kohli", 1000.0);
}
}
