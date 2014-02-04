package com.macoloc.controller.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHelper {

	public static String hashPassword(String email, String password) {
		String hashedPassword = hash(password);
		String cutEmail = email.substring(0, email.indexOf("@"));
		int hashedPasswordCutIndex = hashedPassword.length()/2;
		hashedPassword = hashedPassword.substring(0, hashedPasswordCutIndex) + cutEmail + hashedPassword.substring(hashedPasswordCutIndex, hashedPassword.length());
		
		return hash(hashedPassword);
	}
	
	private static String hash(String str) {
		MessageDigest mdEnc = null;
		try {
			mdEnc = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
		} 
		mdEnc.update(str.getBytes(), 0, str.length());
		String md5 = new BigInteger(1, mdEnc.digest()).toString(16); // Encrypted 
		return md5;
	}
	
}
