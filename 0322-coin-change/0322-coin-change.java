class Solution {
    public int coinChange(int[] coins, int amount) {
        //make one arry
        int dp[]=new int[amount+1];
        //fill every value by large value which is amount+1;
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=amount+1;
        }
        //base case
        dp[0]=0; // to make 0 we need 0 coins

        for(int i=1;i<dp.length;i++)
        {
            //use every coin
            for(int j=0;j<coins.length;j++)
            {
                //if coin value is less  or equal than current amount then only we can use that coin
                if(coins[j]<=i)
                {
                    //we have 2 chioice use or prevoius total coins to make that amount or use new coins and make the amount 
                    //we have to choose minimun value between them 
                    dp[i]=Math.min(dp[i] ,  dp[i-coins[j]]+1) ;
                }

            }
        }
        if(dp[amount]==amount+1)
        return -1;
        return dp[amount];
        
    }
}