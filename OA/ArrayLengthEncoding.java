import java.util.*;

public class ArrayLengthEncoding {
	//count the number of appearence of every letter
	
	public static void main(String[] args){
		int[] test = new int[]{1};
		for(int n: encoding(test)){
			System.out.print(n);
		}

	}
	
	public static List<Integer> encoding(int[] arr) {
		List<Integer> res = new ArrayList<Integer>();
		if(arr == null || arr.length == 0) {
			res.add(0);
			res.add(0);
			res.add(1);
			res.add(0);
			return res;
		}
		
		int curr = arr[0];
		int count = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == curr) {
				count++;
			} else {
				res.add(curr);
				res.add(count);
				count = 1;
				curr = arr[i];
			}
		}
		res.add(curr);
		res.add(count);
		return res;
	}
}