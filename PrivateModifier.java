class PrivateModifier {
private int n = 187;
private void hi(){
System.out.println(n);
}
public static void main(String[] args) {
PrivateModifier obj = new PrivateModifier();
obj.hi();
// obj.n; will give error
}
}
