class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;

        //create dp array
        int dp[][]= new int[n][n];
        //base case
        //if one one length then slice will take it
        for(int i=0;i<n;i++)
        {
            dp[i][i]=piles[i];
        }

        //now for diff lenth range
        for(int len=2;len<=n;len++)
        {
            for(int i=0;i+len<=n ; i++)
            {
                int j=i+len-1;

                //take left
                int takeleft= piles[i]-dp[i+1][j];

                //if take right
                int takeright=piles[j]-dp[i][j-1];

                dp[i][j]=Math.max(takeleft, takeright);
            }
        }
        return dp[0][n-1]>0 ;
    }
}