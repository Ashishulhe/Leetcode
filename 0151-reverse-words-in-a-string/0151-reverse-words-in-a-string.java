class Solution {
    public String reverseWords(String s) {
        //remove extra space by trim
        s=s.trim();
       String arr[]=s.split(" ");//trim by one space
       StringBuilder sb = new StringBuilder();
       for(int i=arr.length-1;i>=0;i--)
       {
            if(! (arr[i].equals(" ") || arr[i].equals("")))
            {

                sb.append(arr[i]);
                if(i!=0)
                {
                    sb.append(" ");
                }
            }    
          
       }
        return sb.toString();
    }
}


/*class Solution {
    public String reverseWords(String s) {
        //remove extra space by trim
        s=s.trim();
        s=s.replaceAll("\\s+", " ");
       String arr[]=s.split(" ");//trim by one space
       StringBuilder sb = new StringBuilder();
       for(int i=arr.length-1;i>=0;i--)
       {
            sb.append(arr[i]);
             if(i!=0)
            {
                sb.append(" ");
            }
          
       }
        return sb.toString();
    }
}*/


