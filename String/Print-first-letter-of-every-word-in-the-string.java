// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Print-first-letter-of-every-word-in-the-string {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            String result = ob.firstAlphabet(S);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        String[] arr = S.split("\\s+");
        String ans = "";
        
        for(int i=0; i<arr.length; i++){
            ans += arr[i].charAt(0);
        }
        
        return ans;
    }
};