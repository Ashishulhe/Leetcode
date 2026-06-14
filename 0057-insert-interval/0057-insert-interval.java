class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        //both the intrervals are alredy sorted
        //create one new 2d array
        int combinedIntervals[][]=new int [intervals.length+ 1][];
        int i=0;
        int k=0;
        boolean isInserted=false;//for adding new intervals elelemnt
        while(i<intervals.length)
        {
            if(!isInserted  && newInterval[0]<=intervals[i][0] ) 
            {
                 combinedIntervals[k++] = newInterval;
                isInserted = true;
            }
            combinedIntervals[k++] = intervals[i];
            i++;
        }
        if(!isInserted)
        {
             combinedIntervals[k] = newInterval;
        }
        

        ArrayList<int[]> res= new ArrayList<>();
        int prev[]=combinedIntervals[0];
        for(i=1;i<combinedIntervals.length;i++)
        {
            if(combinedIntervals[i][0]<=prev[1])
            {
                prev[1]=Math.max(prev[1], combinedIntervals[i][1]);
            }
            else
            {
               res.add(prev);
               prev=combinedIntervals[i];
            }
        }
        res.add(prev);

        return res.toArray( new int [res.size()][]); 
        
    }
}