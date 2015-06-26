//https://leetcode.com/problems/compare-version-numbers/
/*
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
*/
public class CompareVersionNum {
	public int compareVersion(String version1, String version2) {
		int i = 0;
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		
		while(i < v1.length || i < v2.length) {
			if(i < v1.length && i < v2.length) { //if the v1[i] == v2[i], do not need to do anything
				if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])) {
					return 1;
				} else if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])) {
					return -1;
				}
			} else if (i < v1.length) {
				if(Integer.parseInt(v1[i]) != 0) {
					return 1;
				} else if(i < v2.length) {
					if(Integer.parseInt(v2[i]) != 0) {
						return -1;
					}
				}
			}
			i++;
		}
		return 0;
	}
}