/* An E-commerce platform needs a way to process online payments through UPI. The platform doesn't care how the payment is processed, only that any vendor must be able to validateAccount() and transferFunds(double amount). Since Java does not allow multiple inheritance, using an interface allows these payment methods to be "plugged in" easily. */


interface PaymentProcessor {

boolean validateAccount();
void transferFunds(double amount);
}

class Upi implements PaymentProcessor {
@Override
public boolean validateAccount() {
System.out.println("Validating Bank Account and UPI ID...");
return true;
}

@Override
public void transferFunds(double amount) {
System.out.println("Transferred Rs. " + amount + " via UPI securely.");
}
}

public class CompleteAbstraction {
public static void main(String[] args) {

PaymentProcessor payment = new Upi();

if (payment.validateAccount()) {
payment.transferFunds(150.00);
}
}
}