class Solution {
    public int maxDigitRange(int[] nums) {
        int range=0;
        for(int i=0;i<nums.length;i++)
        {
            int value=nums[i];
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;
            while(value>0)
            {
                int digit=value%10;
                if(digit > largest)
                {
                    largest=digit;
                }
                if(digit<smallest)
                {
                    smallest=digit;
                }
                value=value/10;
            }
            if((largest-smallest)>range)
            {
                range=largest-smallest;
            }   
        }
       
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int value=nums[i];
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;
            while(value>0)
            {
                int digit=value%10;
                if(digit > largest)
                {
                    largest=digit;
                }
                if(digit<smallest)
                {
                    smallest=digit;
                }
                value=value/10;
            }
            if((largest-smallest)==range)
            {
               sum=sum+nums[i];
            }   
        }
        return sum;
    }
}