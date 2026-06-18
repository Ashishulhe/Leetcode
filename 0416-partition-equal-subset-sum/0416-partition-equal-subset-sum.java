class Solution {
    Boolean dp[][];//two parameter one is isindes and other is 
    public boolean canPartition(int[] nums) {
        //fisrt find totl Sum
        int totalSum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalSum=totalSum+nums[i];
        }
        //if sum odd then cant partition into two subset
        if(totalSum%2==1)
         return false;
         dp=new Boolean[nums.length][totalSum/2+1];//use this in 
         //index start from o that why totalSum/2+
        
        //helper methd will do rem works
       // if by adding we get half totalSum then we can divide it in subset
        return subset(nums, 0,totalSum/2);
        
        
    }
    public boolean subset(int nums[], int index, int target)
    {
        //base call
        if(target==0)
        return true;
        
        if(target<0 || index==nums.length)
        return false;

        if(dp[index][target]!=null)//alreday calculated
        {
            return dp[index][target];
        }
        //calculate
        
        //at ever index we have two chiuce take or no take in subset
        boolean take=subset(nums,index+1, target-nums[index]);
        boolean nottake=subset(nums,index+1, target);

        dp[index][target]=take||nottake;

        return dp[index][target];
    }
}