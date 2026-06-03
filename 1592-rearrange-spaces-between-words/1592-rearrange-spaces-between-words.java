class Solution {
    public String reorderSpaces(String text) {
        //here we have to count word and spaces also
        int textLength=text.length();
        //convert to word array
        String res=text.trim();
        res=res.replaceAll("\\s+"," ");
        String arr[]=res.split(" ");
        //now count
        int charCount=0;
        for(int i=0;i<arr.length;i++)
        {
            charCount=charCount+arr[i].length();
        }   
        int totalSpaces=textLength-charCount;
        int spaces=0;
        int remSpaces=0;
        if(arr.length>1)
        {
                 spaces=  totalSpaces/(arr.length-1);
                 remSpaces=totalSpaces % (arr.length-1);
        }
        else
        {
            remSpaces=totalSpaces;
        }
        
       /* System.out.println("TotalSpaces-->"+totalSpaces);
        System.out.println("space-->"+spaces);
        System.out.println("remSpace-->"+remSpaces);
    */
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);

            if(i!=arr.length-1)
            {
                int j=0;
                while(j<spaces)
                {
                    sb.append(" ");
                    j++;
                }
            }
            
            
        }  
        //apppend rem space
        for(int j=0;j<remSpaces;j++)
        {
            sb.append(" ");
        }
        return sb.toString();
    }
}