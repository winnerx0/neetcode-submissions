class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        numbers = {}

        for i in range(len(nums)):

            value = numbers.get(target - nums[i])

            if value != None:
                return [value, i]

            numbers[nums[i]] = i
        return []