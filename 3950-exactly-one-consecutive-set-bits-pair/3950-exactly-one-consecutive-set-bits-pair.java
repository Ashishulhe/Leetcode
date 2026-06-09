class Solution {
    public boolean consecutiveSetBits(int n) {
        String bin= Integer.toBinaryString(n);
        int count=0;
        for(int i=1;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1' && bin.charAt(i-1)=='1' )
              count++;
            
        }
        if(count==1)
         return true;
        return false;
        
    }
}