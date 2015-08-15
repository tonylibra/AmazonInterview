fffimport java.util.*;

public class ValidStatement {
	public static void main(String[] args) {
		String s = "([ 5 2 ] 12 ) ";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		if(s == null) {
			return false;
		}
        Stack<Character> stack = new Stack<Character>();
		int i = 0;
		for(; i < s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			}
			
			if(s.charAt(i) == ')') {
				if(stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
			if(s.charAt(i) == ']') {
				if(stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			}
			if(s.charAt(i) == '}') {
				if(stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}
		}
		
		if(stack.isEmpty() && i == s.length()) {
			return true;
		}
		return false;
    }
	
	public static boolean isNum(char c) {
		if(((c - '0') >= 0 && (c - '0') <= 9) || c == ' ') {
			return true;
		}
		return false;
	}
}