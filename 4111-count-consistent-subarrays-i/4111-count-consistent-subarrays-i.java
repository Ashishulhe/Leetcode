class Solution {
    public int countConsistent(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int min=Integer.MAX_VALUE;
            int ans=-1;
            for(int j=i;j<nums.length;j++)
            {
                if(i==j) // first element of subarray as ans intilaization
                {
                    ans=nums[j];
                }
                else
                {
                    ans=ans & nums[j];
                }
                min=Math.min(min,nums[j]);
                if(min==ans)
                 count=count+1;
            }
        }
         return count;
    }
}