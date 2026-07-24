class Solution {
    public boolean judgeCircle(String moves) {

        int x=0;//right x++ left x--
        int y=0;// up y++ down y--;
       for(char ch:moves.toCharArray())
       {
            if(ch=='R')
            {
                x=x+1;
            }
            else if(ch=='L')
            {
                x=x-1;
            }
            else if(ch=='U')
            {
                y=y+1;
            }
            else 
            {
                y=y-1;
            }
            
       }
        if(x==0 && y==0)
            return true;
            else
             return false;

    }
}