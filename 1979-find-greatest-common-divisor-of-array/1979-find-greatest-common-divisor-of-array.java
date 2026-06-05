class Solution {
    public int findGCD(int[] nums) {
        //find min and max
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)//curr element is less than min 
            {
                min=nums[i];//update min
            }
             if(nums[i]>max) // current element greater than max
            {
                max=nums[i]; //update max
            }
        }
        int gcd=1; //cause if no gcd then 1 is 
        for(int i=min;i>=1;i--) //cause gcd cant be greater than min
        {
            if(min%i==0 && max%i==0) // divides bothh min and max perfectly
            {
                gcd=i; //upadte gcd
                break; //stopping loop cause we got the gcd
            }
        }
        return gcd;
    }
}