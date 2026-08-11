class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        //SORT BOTH THE ARRAYS
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum=0;
        int i=prices.length-1;
        int j=discounts.length-1;
        while(j>=0 && i>=0)
        {
            sum= sum+ (prices[i]*(100-discounts[j])/100f);
            i=i-1;
            j=j-1;
        }
        
        while(i>=0)
        {
            sum=sum+prices[i];
            i=i-1;
        }
        return sum;

    }
}