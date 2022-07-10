#https://leetcode.com/problems/two-sum/
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            j = i + 1
            for j in range(j, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
