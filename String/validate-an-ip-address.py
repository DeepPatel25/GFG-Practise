#User function Template for python3

def isValid(s):
    #code here
    a=s.split(".")
    
    if len(a) != 4:
        return 0
    
    for x in a:
        if len(x) > 1 and x[0]=='0':
            return 0
        try:
            if not (int(x)>=0 and int(x)<=255):
                return 0
        except:
            return 0
    
    return 1

#{ 
#  Driver Code Starts
#Initial Template for Python 3

    
if __name__=="__main__":
    t=int(input())
    for _ in range(0,t):
        s=input()
        if(isValid(s)):
            print(1)
        else:
            print(0)
    

# } Driver Code Ends