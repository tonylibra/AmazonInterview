public class ValidParentheses {
	/*
	https://leetcode.com/problems/valid-parentheses/
	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	*/
	public boolean isValid(String s) {
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
}