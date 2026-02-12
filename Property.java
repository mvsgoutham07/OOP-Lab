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

