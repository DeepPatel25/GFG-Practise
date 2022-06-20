// { Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}


class Merge_K_Sorted_Linked_List
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Solution g = new Solution();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
   //Function to merge K sorted linked list.
   Node mergeKList(Node[]arr,int K)
   {
       ArrayList<Integer> a = new ArrayList<>();
       for(int i=0;i<K;i++)
       {
           Node t1=arr[i];
           while(t1!=null)
           {
               a.add(t1.data);
               t1=t1.next;
           }
       }
       int[] a1=new int[a.size()];
       for(int i=0;i<a1.length;i++)
       {
           a1[i]=a.get(i);
       }
       Arrays.sort(a1);
       Node head=new Node(a1[0]);
       Node t=head;
       for(int i=1;i<a1.length;i++)
       {
           Node n=new Node(a1[i]);
           t.next=n;
           t=t.next;
       }
       return head;
   }
}