package com.main;
import java.util.*;
public class circularstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1 :");
		String str1 = sc.nextLine();
		System.out.print("Enter String 2 :");
		String str2 = sc.nextLine();
		String str3 = str1+str1;
		if(str3.contains(str2)) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
        sc.close();
	}

}
