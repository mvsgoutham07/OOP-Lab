class DataOperators {
public static void main(String[] args) {
byte a = 10;
byte b = 5;
int summ = a+b;
int diff = a-b;
int prod = a*b;
int result = a/b;
int mod = a%b;
boolean x1 = a<b;
boolean x2 = a<=b;
boolean x3 = a>b;
boolean x4 = a>=b;
boolean x5 = a!=b;
boolean x6 = a==b;
boolean x7 = ((a!=b) || (a==b)) && (a>b);
int inc = a++;
int dec = b--;
System.out.println("Sum = " + summ);
System.out.println("Difference = " + diff);
System.out.println("Product = " + prod);
System.out.println("Quotient = " + result);
System.out.println("Remainder =" + mod);
System.out.println(x1);
System.out.println(x2);
System.out.println(x3);
System.out.println(x4);
System.out.println(x5);
System.out.println(x6);
System.out.println(x7);
System.out.println("Increment of 10 : " + a);
System.out.println("Decrement of 5 : " + b);
}
}