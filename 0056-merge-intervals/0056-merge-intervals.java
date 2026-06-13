class Solution
{
    public int[][] merge(int[][] intervals) 
    {


        //sort the given 2d array
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        //make one collection to store the merged intervals
        ArrayList<int[]> res=new ArrayList<>();

        //make one curr interrval
        int prev[]=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            //starrt of curr elelemnt with end of previous
            //as in prev there are two elelemnt start , end index as 0,1
            if(intervals[i][0]<= prev[1])
            {
                //update interval
                //prev end value update
                //we comparee bot end and greater is assingned
                prev[1]=Math.max(prev[1], intervals[i][1]);
                //           prev[1] menad end of prev 

            }
            else
            {
                //no overlap
                res.add(prev);
                //upadte curr
                prev=intervals[i];//here directly given array adress
            }
        }
        //adding last element
        res.add(prev);

        return res.toArray( new int[res.size()][] );

    }
}

