// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class GFG
{
   ArrayList<Long> find(long arr[], int n, int x)
   {
       // code here
       long first=-1;
       long last=-1;
       
       ArrayList<Long> res=new ArrayList<>();
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]==x){
           if(first==-1)
           {
               first=i;
           }
           else
           {
               last=i;
           }
           }
           
           if(arr[n-i-1]==x && last==-1)
           {
               last=n-i-1;
           }
          
       }
       res.add(first);
       res.add(last);
       return res;
   }
}



// { Driver Code Starts.

// Driver class
class First-And-Last-Occurance-Of-X {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
  // } Driver Code Ends