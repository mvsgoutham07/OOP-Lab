class FindAvg {
public int avg(int num1, int num2, int num3) {
return (num1+num2+num3)/3;
}
public static void main(String args[]) {
FindAvg x = new FindAvg();
int average = x.avg(23, 54, 89);
System.out.println("The average of 23, 54 and 89 is" + average);
}
}