class Solution {
    public String rearrangeString(String s, char x, char y) {
        char arr[]=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        for(int i=0;i<end;)
        {
            if(arr[i]==y) // do dwap between i amd start
            {
                char temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
                start++;
                i++;
            }
            else if(arr[i]==x)
            {
                char temp=arr[i];
                arr[i]=arr[end];
                arr[end]=temp;
                end--;
                
            }
            else
            {
                i++;
            }

        }
        //make strig again
       return new String(arr);
    }
}