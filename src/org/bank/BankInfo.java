package org.bank;
public class BankInfo extends AxisBank {
	
public void deposit() {System.out.println("9%");}
	public void fixed() {System.out.println("7%");}
	public static void main (String[] args) {
		BankInfo b= new BankInfo();
	b.fixed();
	b.deposit();
	b.saving();
	

}
}
