import java.util.*;
//http://www.lintcode.com/en/problem/reverse-words-in-a-string/
//Given an input string, reverse the string word by word.
public class ReverseWordsInString {
	public static void main(String[] args) {
		String s = "the sky is blue";
			System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) {
		String[] wordsArr = s.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(int i = wordsArr.length-1; i >= 0; i--) {
			if(wordsArr[i] == null) {
				continue;
			}
			
			sb.append(wordsArr[i]);
			if(i > 0) {
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}
}