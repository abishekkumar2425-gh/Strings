package com.main;
public class circularstring {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		String str3 = str1+str1;
		if(str3.contains(str2)) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}

}
