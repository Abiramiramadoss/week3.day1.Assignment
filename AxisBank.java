package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("New Deposit-Rs.2000");
		

	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		BankInfo obj1= new BankInfo();
		obj1.deposit();
		obj.deposit();
		obj.fixed();
		obj.saving();

	}

}
