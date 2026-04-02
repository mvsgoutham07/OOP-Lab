/* A notification system is designed with a superclass Notifier that supports sending notifications through multiple channels such as general alerts, email, and SMS. To achieve flexibility, the class defines multiple overloaded send() methods with different parameter lists (e.g., message only, message with email, message with phone number). These methods use different access modifiers (public, protected, default, private) to enforce access control, ensuring that certain internal notification mechanisms remain hidden from external classes.

A subclass AppNotifier extends Notifier and utilizes these inherited methods without redefining them, demonstrating compile-time polymorphism (method overloading) and how method resolution depends on argument types. The program should also show how a private method is not directly accessible in the subclass but can still be executed indirectly through a public method defined in the superclass.

Write a Java program to:

Implement all overloaded send() methods with different access levels
Demonstrate method overloading through different method calls
Show accessibility of public, protected, and default methods in the subclass
Prove that private methods cannot be accessed directly but can be invoked internally */

class Notifier {
public void send(String message) {
System.out.println("General Alert: " + message);
logToSystem(message); 
}
protected void send(String message, String email) {
System.out.println("Email sent to " + email + ": " + message);
}
void send(String message, long phoneNumber) {
System.out.println("SMS sent to " + phoneNumber + ": " + message);
}
private void logToSystem(String message) {
System.out.println("Internal System Log: Notification archived.");}
}

class AppNotifier extends Notifier {
void displayFeatures() {
System.out.println("App is opened.");
}
}

public class Overloading {
public static void main(String[] args) {
AppNotifier myApp = new AppNotifier();
myApp.send("System Update available."); 
myApp.send("Welcome!", "xyz@abc.com"); 
myApp.send("Your OTP is 1234", 9876543210L); 
// myApp.logToSystem("Test"); 
}
}


