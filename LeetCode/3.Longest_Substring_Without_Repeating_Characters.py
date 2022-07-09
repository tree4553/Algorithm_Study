class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s == "":
            return 0
        answer = 1
        
        for i in range(len(s)):
            #print('i:', i)
            temp = 1
            array = []
            repeat = False
            for j in range(i, len(s)-1):
                #print('j:',j, ', s[j]:',s[j])
                array.append(s[j])
                #print(array)
                for k in range(len(array)):
                    if array[k] == s[j+1]:
                        #print('k=',k,', j+1=',j+1,',array[k]=',array[k],', s[j+1]=',s[j+1])
                        if answer < temp:
                            #print('answer:', answer, ', temp:', temp)
                            answer = temp
                        repeat = True
                        break
                if repeat == True:
                    break
                else:
                    temp += 1
                    if answer < temp:
                            #print('answer:', answer, ', temp:', temp)
                            answer = temp
        
        return answer

# Time Limit Exceed
# abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~
# abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~
# ...


def lengthOfLongestSubstring(self, s: str) -> int:
        # Handle empty edge case
        if not s: return 0
        
        # Create tabulation array and populate with initial '0' values
        dp = [0] * len(s)
        
        # Create a "found chars" dictionary, with 'char' as a key and 'index' as a value
        chars = {}
        
        # Loop over each char in the string
        for i, char in enumerate(s):
            
            # If char has been seen before:
            if char in chars:
                # Longest is the smaller between the last answer + 1 or the distance between the current index and the index of the first matching char.AssertionError
                dp[i] = min(dp[i-1] + 1, i - chars[char])
                # Update last char-seen index
                chars[char] = i
            else:
                # Longest is the previous answer incremented by one, with an edge case for the first index
                dp[i] += dp[i - 1] + 1 if i > 0 else 1
                # Update the last char-seen index
                chars[char] = i
                
        # Return the largest answer stored in the dynamic programming answers array
        return max(dp)
