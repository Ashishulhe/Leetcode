import java.util.*;
class Solution {
    public List<String> generateValidStrings(int n, int k) {
        
        ArrayList <String> list1=new ArrayList<>();
        for(int j=0;j<(int)Math.pow(2,n);j++)
        {
            String str = Integer.toBinaryString(j);
            StringBuilder sb=new StringBuilder();
                for(int m=1;m<=n-str.length();m++)
                {
                    sb.append("0");
                }
                sb.append(str);
            int sum=0;
            //trvaerese string
            boolean flag=true;  // if two consecutive one then false;
            for(int i=1;i<sb.length();i++)
            {
                if(sb.charAt(i)=='1')
                {
                    sum=sum+i;
                }
                if(sb.charAt(i)=='1' && sb.charAt(i-1)=='1' )
                 {
                    flag=false;
                    break;
                 }
            }
            if(flag && sum<=k)
            {
                
                list1.add(sb.toString());
            }
            
        }
        return list1;
    }
}