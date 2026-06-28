class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int count=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                y=y+1;
            }
            else if(moves.charAt(i)=='D')
            {
                y=y-1;
            }
           else if(moves.charAt(i)=='R')
            {
                x=x+1;
            }
           else if(moves.charAt(i)=='L')
            {
                x=x-1;
            }
           else
           {
             count=count+1;
           }
        }
        return Math.abs(x)+Math.abs(y)+count;
        
    }
}