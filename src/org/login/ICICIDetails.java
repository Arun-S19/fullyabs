package org.login;// fully abstraction or interface

public class ICICIDetails implements ICICIBank{  // use implemet keyword for interface 

	@Override
	public void iciciATMMachinePassword() {
		long pass =45895l;
		System.out.println("atm password is"+pass);
		
	}

	@Override
	public void icicbankdetails() {
		String ss= "chennai";
		System.out.println("icici bank located in:"+ss);
		
		
	}
public static void main(String[] args) {
	ICICIDetails i=new ICICIDetails();
	i.icicbankdetails();
	i.iciciATMMachinePassword();
}
}
