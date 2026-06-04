class Solution {
    public int trailingZeroes(int n) {
        int temp=5;
        int sum=0;
        while(true)
        {
            int count=n/temp;
            sum=sum+count;
            temp=temp*5;
            if(temp>n)
            {
                break;
            }
        }

       return sum; 
    }
}