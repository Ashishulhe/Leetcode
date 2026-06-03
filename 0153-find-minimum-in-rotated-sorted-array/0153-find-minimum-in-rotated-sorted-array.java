class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        
        while(low<high)
        {
            int mid=low + (high-low)/2;
            if(nums[mid]>nums[high]) 
            // mid index elelemnt is gratert than high index elemenet
            //means the low elemennt is on right side
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return nums[low];
    }
}