import java.util.*;
class If_ElseIf_Else {
public static void main(String[] args) {
Scanner xyz = new Scanner(System.in);
System.out.println("Enter your age : ");
int age = xyz.nextInt();
if(age<13) {
System.out.println("CHILD");
}
else if (age<20){
System.out.println("ADOLESCENT");
}
else if (age<60){
System.out.println("ADULT");
}
else{
System.out.println("OLD");
}
}
}