class Solution {
    public int maxProduct(int[] nums) {
       int ans=nums[0];
       int minProduct=nums[0];
       int maxProduct=nums[0];

       for(int i=1;i<nums.length;i++)
       {
            if(nums[i]<0)//swapping 
            {
                int temp=minProduct;
                minProduct=maxProduct;
                maxProduct=temp;
            }
            //now decide wheather weshould start new subarray or continue previous one
            maxProduct=Math.max( nums[i] , maxProduct*nums[i]);
            minProduct=Math.min(nums[i] , minProduct*nums[i]);

            ans=Math.max(ans ,maxProduct);

       }
       return ans;
    }
}