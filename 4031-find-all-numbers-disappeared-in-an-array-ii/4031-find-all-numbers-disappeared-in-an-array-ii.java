class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {

        
     //make one boolean array
     boolean visited[]= new boolean[100001];
     for(int i=0;i<nums.length;i++)
     {
        visited[nums[i]]=true; // we have visited it
     }
     //now we will make the group of that consecutive interval
     List<List<Integer>> list= new ArrayList<>();
     int start=-1;
     int end=-1;
     int i=1;
     for(i=lower;i<=upper;i++)
     {
        if(!visited[i])
        {
            if(start==-1)
             start=i;
        }
        else //visted true ahe manje range sampli na
        {
            if(start!=-1)
            {
                List<Integer>sublist= new ArrayList<>();
                sublist.add(start);
                sublist.add(i-1);

                //reset start
                start=-1;
                list.add(sublist);
            }
           
        } 
     }
     if(start!=-1)
            {
                List<Integer>sublist= new ArrayList<>();
                sublist.add(start);
                sublist.add(i-1);

                //reset start
                start=-1;
                list.add(sublist);
            }
     return list;
    
        
    }
}