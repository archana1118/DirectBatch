package org.bank;
public class AxisBank {
	public  void saving() {System.out.println("2%");}
	public static void main (String[] args) {
		AxisBank b = new AxisBank();
		b.saving();
		
		AxisBank d = new AxisBank();
		d.deposit();

}
	public void deposit() { {System.out.println("1%");}	}
}