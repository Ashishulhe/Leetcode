class Solution {
    public long countValidSubstrings(String s) {

        int left=0;
        long count=0;

        //convert string to char array
        char arr[]=s.toCharArray();
        

        // we want substring in which abc is not present
        for(int right=0;right<s.length();right++)
        {
            if(right-left>=2 && arr[right-2]=='a' && arr[right-1]=='b' && arr[right]=='c') // this condition matches means abc present
            {
                left=right-1;
            }

            count=count + right-left+1;
        }

        return count;
        
    }
}