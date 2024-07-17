package com.exception1;

public class Otpverification {
	int Otp= 9456;
	public Otpverification (int otp) {
		if (otp!=this.Otp) {
			throw new Invalidotp("Otp not match resend");
			
		}
		else {
			System.out.println("Otp match sucessfull");
		}
	}
	

}
