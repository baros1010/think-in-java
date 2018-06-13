package usefulcoding;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.stream.IntStream;

public class date {

	public static String paddingCharR(String str, char paddingChar, int paddingLength) {
		if (str == null) {
			return null;
		}
		int nlen = paddingLength - str.length();
		if (nlen <= 0) {
			return str;
		}
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < nlen; i++) {
			sb.append(paddingChar);
		}
		return sb.toString();
	}
	public static String paddingChar(String str, char paddingChar, int paddingLength) {
		if (str == null) {
			return null;
		}
		String strRes = "";
		int nlen = paddingLength - str.length();
		
		for (int i = 0; i < nlen; i++) {
			strRes += paddingChar;
		}
		return strRes + str;
	}
	public static String trimZero(String str) {
		if (str == null || str.length() == 0) {
			return "0";
		}
		int nlen = str.length();
		int nbegin = 0;
		for (; nbegin < nlen; nbegin++) {
			if (str.charAt(nbegin) != '0') {
				break;
			}
		}
		String retVal = str.substring(nbegin, nlen);
		if (retVal.trim().length() == 0) {
			return "0";
		}
		return retVal;
	}
	public static String trimSpaceR(String str) {
		if (null == str) {
			return "";
		}
		String buff = "";
		int nend = 0;
		for (nend = str.length() - 1; nend >= 0; nend--) {
			if (str.charAt(nend) != ' ' && str.charAt(nend) != '　') {
				break;
			}
		}
		if (0 <= nend) {
			buff = str.substring(0, nend + 1);
		}
		return buff;
	}
	public static String trimSpace(String str) {
		if (null == str) {
			return "";
		}
		int nlen = str.length();
		int nbegin = 0;
		int nend = 0;
		for (nbegin = 0; nbegin < nlen; nbegin++) {
			if (str.charAt(nbegin) != ' ' && str.charAt(nbegin) != '　') {
				break;
			}
		}
		for (nend = nlen - 1; nend >= 0; nend--) {
			if (str.charAt(nend) != ' ' && str.charAt(nend) != '　') {
				break;
			}
		}
		if (nbegin == 0 && nend == nlen - 1) {
			return str;
		}
		String buff = "";
		if (nbegin <= nend) {
			buff = str.substring(nbegin, nend + 1);
		}
		return buff;
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
	Integer [] a=new Integer[5];
	System.out.println(a[1]);
	}

}
