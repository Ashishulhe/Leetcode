
class Solution {
    public int minimumCost(int[] nums, int k) {

        long mod = 1_000_000_007L;
        long inv2 = 500000004L; // Modular inverse of 2

        long src = k;
        long cost = 0;
        long totalcost = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > src) {

                long operation = (nums[i] - src + k - 1) / k;

                src += operation * k;

                long oldcost = cost;
                long newcost = cost + operation;

                long sumOld = ((oldcost % mod) * ((oldcost + 1) % mod)) % mod;
                sumOld = (sumOld * inv2) % mod;

                long sumNew = ((newcost % mod) * ((newcost + 1) % mod)) % mod;
                sumNew = (sumNew * inv2) % mod;

                long addedcost = (sumNew - sumOld + mod) % mod;

                totalcost = (totalcost + addedcost) % mod;

                cost = newcost;
            }

            src -= nums[i];
        }

        return (int) totalcost;
    }
}

/*class Solution {
    public int minimumCost(int[] nums, int k) {
        //here varibale in long we cause they can overflow in int
        long cost=0;// cost for every opeation of incresing resource
        long totalcost=0;//total cost
        long src=k;//this is ou resource for traversing
        long mod = 1_000_000_007;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>src)
            {
                long opeartion=(nums[i]-src+k-1)/k;
                src=src+opeartion*k;
                
                //now as every time cost increse we need some solution cause we have calculated allopearion in once but cant do direct addition so
                long oldcost=cost;
                //sum  upto cost
                //sum upto cost+opration
                //and then minus then and we get what we want to add
                long addedcost=((oldcost+opeartion)*(oldcost+opeartion+1)/2)- (oldcost*(oldcost+1)/2);
                 totalcost=(totalcost+addecost) % mod;//here we are stopping overflow
                
                //update the cost
                cost=cost+opeartion;
            }
            
           
           src=src-nums[i];
        }
        return (int)totalcost;
    }
}*/