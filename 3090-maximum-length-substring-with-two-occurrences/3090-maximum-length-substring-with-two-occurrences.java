class Solution {
    public int maximumLengthSubstring(String s) {
        //create array for storing 
        //a--97 , z-->122
        int arr[]=new int[26];
        int left=0;
        int right=0;
        int maxlength=0;
        for(right=0;right<s.length();right++)
        {
            //firt increse count if now count becones three then its invalid so make itvalid by shrinking window
            int value=(int)s.charAt(right)-97;
            arr[value]=arr[value]+1; // incresed the fewquency by one
           while(arr[value]>2)
           {
                char ch=s.charAt(left);
                //we will move left pointer until its beome valid
                arr[ch-'a']=arr[ch-'a']-1;// decrese frequency by one
                left=left+1;
           }
           maxlength=Math.max(maxlength, right-left+1);
        }
        //now return maxlength
        return maxlength;
    }
}