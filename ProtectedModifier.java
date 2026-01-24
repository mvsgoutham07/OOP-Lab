public class ProtectedModifier {
protected int n = 2840;
protected void hi(){
System.out.println(n);
}
public static void main(String[] args) {
ProtectedModifier obj = new ProtectedModifier();
obj.hi();
}
}
