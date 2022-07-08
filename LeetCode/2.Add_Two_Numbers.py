# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        result = ListNode()
        
        a = 0
        count = -1
        while l1.next != None:
            count += 1
            a += l1.val * (10 ** count)
            l1 = l1.next
        count += 1
        a += l1.val * (10 ** count)
        
        b = 0
        count = -1
        while l2.next != None:
            count += 1
            b += l2.val * (10 ** count)
            l2 = l2.next
        count += 1
        b += l2.val * (10 ** count)
        
        sum = a + b
        print(sum)
        result.val = sum%10
        sum //= 10
        while sum != 0:
            next = ListNode()
            next.val = sum%10
            if result.next == None:
                result.next = next
            else:
                last = ListNode()
                last = result.next
                while last.next != None:
                    last = last.next
                last.next = next
            #result.next = next
            sum //= 10
        
        return result
        
