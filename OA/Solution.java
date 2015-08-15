import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        if(ar.length == 0 || ar.length == 1) {
            printArray(ar);
            return;
        }
        int i =  ar.length-1;
        while( i > 0 && ar[i] < ar[i-1]) {
            int tmp = ar[i];
            int j = i-1;
            while( j >= 0 && tmp < ar[j]) {
                ar[j+1] = ar[j];
                j--;
                printArray(ar);
            }
            ar[j+1] = tmp;
			printArray(ar);
			i--;
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int s = in.nextInt();
        // int[] ar = new int[s];
        //  for(int i=0;i<s;i++){
        //     ar[i]=in.nextInt(); 
        //  }
		// int[] ar = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        //  insertIntoSorted(ar);
        String s = "1 2";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                continue;
            }
            System.out.println(";"+s.charAt(i)+";");
        }
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
