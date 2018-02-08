package com.synechron.rakhiyana;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
public class PasswordEncryption {

	public static void main(String[] args) {
		
		String str = "mango";
		
		byte[] encodedBytes = Base64.getEncoder().encode(str.getBytes());
		System.out.println("encodedBytes " + new String(encodedBytes));
		byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
		System.out.println("decodedBytes " + new String(decodedBytes));
	}

}
