class Solution {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int sum=1;
        while(n>4)
        {
            
            sum=sum*3;
            n=n-3;
        }
        sum=sum*n;
        return sum;
        
    }
}