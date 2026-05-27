class Solution {
    public int minimumSwaps(int[] nums) {
        int count=0;
        int start=0;
        int end=nums.length-1;
        
        while(start<end)
        {
            int startnum=nums[start];
            int endnum=nums[end];
            if(startnum==0 && endnum!=0) // count++
            {
                count++;
                start++;
                end--;
            }
            else if(startnum!=0) //at start we want zero
            {
                start++;
            }
            else if(endnum==0) // non zero
            {
                end--;
            }
        }
        return count;
        
    }
}