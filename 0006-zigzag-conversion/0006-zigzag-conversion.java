class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
         return s;
        //make 2d array
        int total=s.length();
        //in one cycle of n-1 we can fill(n-1)*2 element that is 2n-2 element
        int one_cycle=2*numRows-2;
        int col= (total * (numRows-1)  )/one_cycle ;
        int rem= total % one_cycle;
        if(rem > 0)
        {
            col = col + 1;

            if(rem > numRows)
            {
                col = col + (rem - numRows);
            }
        }


        
        int arr[][]= new int [numRows][col];
        //take two variable i and j,
        int index=0;
        //if i is increasing then j is constant  and if i decresing j increasing
       // i will go from 0 to 
       int i=0;
       int j=0;
       boolean flag=true;//by this flag we will decide
       while(index<s.length())
       {
            arr[i][j]=s.charAt(index);
            //if flag true
            if(i==numRows-1)
            {
                flag=false;
            }
            else if(i==0)
            {
                flag=true;
            }
            if(flag)
            {
                i++;
            }
            else 
            {
                i--;
                j++;
            }
            index++;
       }
       //loop through all elemenet
       StringBuilder sb = new StringBuilder();
       for( i=0;i<numRows;i++)
       {
            for(j=0;j<col;j++)
            {
                if(arr[i][j]!=0)
                {
                    sb.append((char)arr[i][j]);
                }
            }
       }
       return sb.toString();
    }
}