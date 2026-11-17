class Solution 
{
    public List<List<String>> findMismatchedSegments(String s1, String s2)
     {

        //convert both string to char Array
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        //create one list

        ArrayList<List<String>> list1= new ArrayList<List<String>>();

        int start=-1;
        int end=-1;

        for(int i=0;i<s1.length();i++) //looping every character
        {
            //check if mismatch
            if(arr1[i]!=arr2[i])
            {
                if(start==-1)
                {
                    start=i; //update start
                }
                end=i;//update ending
            }
            else // character same
            {
                if(start!=-1) // means we have the unmatched sequence
                {
                    String sub1=s1.substring(start,end+1);
                    String sub2=s2.substring(start,end+1);
                    //create ArrayList
                    ArrayList<String> list2= new ArrayList<>();
                    list2.add(sub1);
                    list2.add(sub2);
                    list1.add(list2);

                    // Reset for next segment
                    start = -1;
                    end = -1;

                }
            }  
        } // for complete

         //handle last mismatched element
            if(start!=-1) // means we have the unmatched sequence
                {
                    String sub1=s1.substring(start,end+1);
                    String sub2=s2.substring(start,end+1);
                    //create ArrayList
                    ArrayList<String> list2= new ArrayList<>();
                    list2.add(sub1);
                    list2.add(sub2);
                    list1.add(list2);

                    // Reset for next segment
                    start = -1;
                    end = -1;

                }
        return list1;
        
    }
}