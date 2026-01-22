import java.util.*;
public class Switch {
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.println("Select your age group : ");
System.out.println("1 : CHILD ");
System.out.println("2 : TEENAGER");
System.out.println("3 : ADULT");
System.out.println("4 : OLD");
System.out.println("Enter suitable option : ");
int age = x.nextInt();
switch (age) {
case 1:
System.out.println("Booking confirmed for CHILD Ticket.");
break;  
case 2:
System.out.println("Booking confirmed for TEENAGER Ticket.");
break;
case 3:
System.out.println("Booking confirmed for ADULT Ticket.");
break;
case 4:
System.out.println("Booking confirmed for OLD Ticket.");
break;
default:
System.out.println("Invalid Entry !");
}
}
}