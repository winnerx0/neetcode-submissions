class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        res = {}

        for i in range(len(nums)):
            ans = res.get(target - nums[i])
            if ans is not None:
                return [ans, i]
            res[nums[i]] = i
        return []