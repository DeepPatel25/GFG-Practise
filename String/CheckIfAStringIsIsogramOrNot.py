
#User function Template for python3

class Solution:
    
    #Function to check if a string is Isogram or not.
    def isIsogram(self,s):
        #Your code here
        # Convert the word or sentence in lower case letters.
        clean_word = s.lower()
 
        # Make an empty list to append unique letters
        letter_list = []
 
        for letter in clean_word:
 
            # If letter is an alphabet then only check
            if letter.isalpha():
                if letter in letter_list:
                    return False
                letter_list.append(letter)
 
        return True

#{ 
#  Driver Code Starts
#Initial Template for Python 3




def main():
    T=int(input())
    
    while(T>0):
        
        s=input()
        obj = Solution()
        if obj.isIsogram(s) is True:
            print(1)
        else:
            print(0)
        T-=1


if __name__=="__main__":
    main()
# } Driver Code Ends