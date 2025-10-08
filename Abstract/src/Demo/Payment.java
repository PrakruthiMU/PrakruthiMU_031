package Demo;

abstract class Payment1 {
	abstract void pay(int amount);
	void showpaymentGateway() {
		System.out.println("Using secure payment Gateway..");
	}
}
class CreditCardPayment extends Payment1 {
	void pay(int amount) {
		System.out.println("Paid $" + amount + " using Cedit Card");
	}
}
class UPIPayment extends Payment1 {
	void payment (int amount) {
		System.out.println("paid $" + "using UPI");
	}
	void pay(int amount) {
		System.out.println("paid $" + "amount" + "using UPI");
	}
}
class Cashpayment extends Payment1 {
	void pay(int amount) {
		System.out.println("paid $" + "amount" + "in cash");
	}
}
public class Payment {
public static void main(String[] args) {
	Payment1 p1 = new CreditCardPayment();
	Payment1 p2 = new UPIPayment();
	Payment1 p3 = new Cashpayment();
	
	p1.showpaymentGateway();
	p1.pay(500);
	p1.showpaymentGateway();
	p1.pay(1000);
	p1.showpaymentGateway();
	p1.pay(1500);
}
}
	









	

	


