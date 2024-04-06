class Solution
{
    public int solve(int []nums,int prev,int index)
    {
        if(index==nums.length)
        {
            return 0;
        }
        if(prev==-1)
        {   
            return Math.min(solve(nums,nums[index],index+1),1+solve(nums,-22,index+1));    
        }
        else if(nums[index]<=prev)
        {
          return 1+solve(nums,prev+1,index+1);
        }
        else
        {
            return Math.min(solve(nums,nums[index],index+1),1+solve(nums,prev+1,index+1));
        }
        
    }
    
    public int min_operations(int []nums)
    {
        // Code here
        return solve(nums,-1,0);
    }
}