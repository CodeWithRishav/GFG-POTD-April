class Solution:
    def min_operations(self,nums):
        # Code here
        dp = [1 for i in range(len(nums))]
        dp[0] = 1
        for i in range(1, len(nums)):
            for j in range(i):
                if nums[i] > nums[j] and nums[i] - nums[j] >= (i-j):
                    dp[i] = max(dp[i], 1 + dp[j])
        max_ls = max(dp)
        return len(nums) - max_ls