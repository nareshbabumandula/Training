package oops;

public class ICICI implements RBI{

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.MinimumBalance();
		ic.MaximumWithDrawl();
		ic.MaxLoan();
		ic.MaximumWithDrawl();
		ic.MinROI();
	}
	public void MinimumBalance() {
		System.out.println("Minimum balance is:"+1000);
	}
	public void MinimumWithDrawl() {
		System.out.println("MinimumWithDrawl balance is:"+100);
	}
	public void MaximumWithDrawl() {
		System.out.println("MinimumWithDrawl balance is:"+50000);
	}
	public void MinROI() {
		System.out.println("MinimumWithDrawl balance is:"+4 +"%");
	}
	public void MaxLoan() {
		System.out.println("MinimumWithDrawl balance is:"+5000000);
	}
}
