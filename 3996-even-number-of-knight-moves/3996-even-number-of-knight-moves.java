class Solution {
    public boolean canReach(int[] start, int[] target) {
        //using third hint
        int startsum=start[0]+start[1];
        int targetsum=target[0]+target[1];

        if  (((startsum%2==1) && (targetsum%2==1))   ||  ((startsum%2==0) && (targetsum%2==0)))
        {
            return true;
        }
        else
          return false;
    }
}