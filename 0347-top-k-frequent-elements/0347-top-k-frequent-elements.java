import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create hashmap
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int key:nums)
        {

            map.put(key, map.getOrDefault(key, 0) + 1);

        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new SortList());

        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=list.get(i).getKey();
        }

      return res;  
    }
}
class SortList implements Comparator<Map.Entry<Integer,Integer>>
{
    
    public int compare(Map.Entry<Integer,Integer> entry1 ,  Map.Entry<Integer,Integer> entry2 )
    {
        return entry2.getValue().compareTo(entry1.getValue());
    }
}

