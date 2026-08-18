package com.main;
public class vowelscons {
	private static boolean chvow(char v) {
		if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u') {
			return true;
		}
		else {
			return false;
		}
	}		

	public static void main(String[] args) {
		String str ="nation";
		String strfi; char c = str.charAt(0);		
		
		if(chvow(c)) {
			strfi ="V";
		}
		else {
			strfi ="C";
		}
		for(int i=1;i<str.length();i++) {
			char ch = str.charAt(i);
			if(chvow(ch)) {
				if(strfi.charAt(strfi.length()-1)!='V') {
					strfi=strfi + "V";
				}
			}
			else {
				if(strfi.charAt(strfi.length()-1)!='C') {
					strfi=strfi + "C";
				}
			}
		}
       System.out.println(strfi);
       
	}

}

