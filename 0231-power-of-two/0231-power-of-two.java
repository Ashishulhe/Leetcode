class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        return true;
        int rem=0;
        int que=n;
        while(n>1)
        {
            que=n/2;
            rem=n%2;
            if(rem==1)
              return false;
            n=que;
        }
        if( que==1 && rem==0)
         return true;
        return false;
    }
}