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
