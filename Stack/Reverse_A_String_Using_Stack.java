// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Reverse_A_String_Using_Stack {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> st = new Stack<>();
        int len = S.length();
        
        for(int i=0; i<S.length();i++){
            st.push(S.charAt(i));
        }
        String a = "";
        for(int i=0;i<len; i++){
            a = a + Character.toString(st.pop());
        }
        
        return a;
    }

}