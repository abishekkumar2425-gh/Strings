package com.main;
import java.util.*;
public class ValidParenthesis {

	public static void main(String[] args) {
		String str = "({[]}";
		char top = 0;
		Deque<Character> Stack = new ArrayDeque<>();
		for(char c: str.toCharArray()) {
			if( c == '(' || c == '{' || c == '[') {
				Stack.push(c);
			}
			else {
			   top = Stack.pop();
			}
			if((c == ')' && top != '(')||
			  (c == '}' && top != '{')||
			  (c == ']' && top != '[')) {
				System.out.println("Invalid Parenthesis");
				return ;
			}
		}
		if(Stack.isEmpty()) {
			System.out.println("Valid Parenthesis");
		}
		else {
			System.out.println("Invalid Parenthesis");
		}
	}

}
