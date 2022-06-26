#User function Template for python3

class Solution:
    def EvenOdd(self, n1, n2):
        # code here
        a=int(n1)
        b=int(n2)
        
        c=a*b
        if c%2==0:
            return 1
        else:
            return 0


#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        a = int(input().strip())
        b = int(input().strip())
        ob = Solution()
        ans = ob.EvenOdd(a,b)
        print(ans)
# } Driver Code Ends