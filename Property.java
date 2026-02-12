/* Case Study: Property Management System Using Hierarchical Inheritance
Scenario:
A family owns ancestral property that is shared among children. The property includes common details such as total land area and type of property. Each child utilizes the inherited property for different purposes based on their individual requirements.
To efficiently manage and represent this scenario, a software system needs to be developed using Object-Oriented Programming concepts. The system should demonstrate how multiple child entities inherit common property details from a single parent entity while maintaining their own specific usage information.
System Requirements:
Parent Class: Father
The parent class should contain common property details.
Attribute
Description
landArea
Total land area owned by the family
propertyType
Type of property owned
Methods:
    • showProperty() → Displays common property details.
Child Class 1: ChildOne
This class represents the first child who uses the inherited property for a specific purpose.

Methods:
    • showUsage() → Displays usage details along with inherited property details.
Child Class 2: ChildTwo
This class represents the second child who uses the inherited property for a different purpose.
Attribute
Description
usage
Type of utilization of property
Methods:
    • showUsage() → Displays usage details along with inherited property details. 



Tasks:
Task 1: UML Class Diagram
Draw a UML Class Diagram representing:
• Parent class
• Child classes
• Attributes and methods
• Inheritance relationship between classes
Task 2: Use Case Diagram
Draw a Use Case Diagram for the Property Management System showing:
• System boundary
• Actors interacting with the system
• Use cases related to property viewing and usage management
• Relationships between actors and use cases
Task 3: Program Implementation
Write a Java program that:
    1. Creates a parent class named Father.
    2. Creates two child classes named ChildOne and ChildTwo using hierarchical inheritance.
    3. Demonstrates how child classes access parent class properties and methods.
    4. Creates objects for both child classes.
    5. Displays property and usage details using appropriate methods. */


class Father {
float landArea = 25.0f;
String propertyType = "Commercial Land";
void showProperty() {
System.out.println("Land Area : " + landArea + " acres");
System.out.println("Property Type : " + propertyType);
}
}
class ChildOne extends Father {
String usage = "Build shopping complex";
void showUsage() {
System.out.println("CHILD-1 : ");
showProperty();
System.out.println("Usage by Child-1 : " + usage);
}
}
class ChildTwo extends Father {
String usage = "Run a hotel";
void showUsage() {
System.out.println("CHILD-2 : ");
showProperty();
System.out.println("Usage by Child-2 : " + usage);
}
}
public class Property {
public static void main(String[] args) {
ChildOne c1 = new ChildOne();
ChildTwo c2 = new ChildTwo();
c1.showUsage();
c2.showUsage();
}
}
