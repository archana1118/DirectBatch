package org.bank;
public class AxisBank {
	public  void saving() {System.out.println("2%");}
	public static void main (String[] args) {
		AxisBank b = new AxisBank();
		b.saving();
		
		AxisBank c = new AxisBank();
		c.deposit();
		
		AxisBank cd = new AxisBank();
		cd.deposit();
}
	public void deposit() { {System.out.println("1%");}	}
}