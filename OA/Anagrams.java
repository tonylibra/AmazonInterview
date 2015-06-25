public class Anagrams {
	//Given an array of strings, return all groups of strings that are anagrams.
	//https://leetcode.com/problems/anagrams/
	public static void main(String[] args) {
		
	}
	
	public List<String> anagramsImp(String[] strs) {
		List<String> result = new ArrayList<String>();
		HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		
		for(String str: strs) {
			int[] count = new int[26];
			//get the key of the String
			for(int i = 0; i < str.length(); i++) {
				count[str.charAt(i) - 'a']++;
			}
			int hash = getHash(count);
			//if there is no such string
			if(!map.containsKey(hash)) {
				map.put(hash, new ArrayList<String>());
			}
			//add the string to the ArrayList in the map
			map.get(hash).add(str);
		}
		
		for(List<String> tmp: map.values()) {
			if(tmp.size() > 1) {
				result.addAll(tmp);
			}
		}
		
		return result;
	}
	
	private int getHash(int[] count) {
		int hash = 0;
		int a = 378551;
		int b = 63689;
		
		for(int num : count) {
			hash = hash * a + num;
			a = a * b;
		}
		return hash;
	}
}