class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
       // HashSet<Integer> set= new HashSet<>();
       ArrayList <Integer> list= new ArrayList<>();
       int count=1;
       int j;
       for(j=1;j<nums.length;j++)
       {
            if(nums[j-1]==nums[j])
            {
                count++;
            }
            else
            {
                int index= count<=k ? count : k;
                for(int i=0;i<index;i++)
                {
                    list.add(nums[j-1]);
                }
                count=1;
            }
       }
       int index= count<=k ? count : k;
                for(int i=0;i<index;i++)
                {
                    list.add(nums[j-1]);
                }
        //now convrt that list to array
        int arr[]= new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}

/*for(int i=0;i<nums.length;i++)
        {
            int count=1;
            int j=i+1;
            while(j<nums.length && count<k)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                    j++;
                }
                else
                 break;
            
            }
            if(count<=k))
             set.add;
        }
        //now convert list to array
        int arr[]=new int[set.size()];
        for(int i=0;i<set.size();i++)
        {
            arr[i]=set.get(i);
        }
        return arr;*/