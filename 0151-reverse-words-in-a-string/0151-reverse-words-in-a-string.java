class Solution {
    public String reverseWords(String s) {
        //remove extra space by trim
        s=s.trim();
        s=s.replaceAll("\\s+", " ");
       String arr[]=s.split(" ");//trim by one space
       StringBuilder sb = new StringBuilder();
       for(int i=arr.length-1;i>=0;i--)
       {
          /*if(!arr[i].equals(" ") ) // if not space then append the word and 1 
          {
            sb.append(arr[i]);
             if(i!=0)
            {
                sb.append(" ");
            }
            
          }*/
          
            sb.append(arr[i]);
             if(i!=0)
            {
                sb.append(" ");
            }
          
       }
        return sb.toString();
    }
}