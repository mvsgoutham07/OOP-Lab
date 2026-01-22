import java.util.*;
public class ForLoop {
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.println("Enter a number : ");
long n = x.nextInt();
long sum = 0;
for (int i = 0; i<=n; i++){
sum = sum + i;
}
System.out.println("The sum of all the integers from 0 to " + n + " is : ");
System.out.print(sum);
}
}