class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)
         return 1;
        StringBuilder sb = new StringBuilder();
        int count=1;
        int i=0;
        for(i=1;i<chars.length;i++)
        {
            if(chars[i-1]==chars[i])
            {
                count++;
            }
            else
            {
                sb.append(chars[i-1]);
                if(count>1)
                sb.append(count);

                count=1;
            }
        }
        sb.append(chars[i-1]);
        if(count>1)
        sb.append(count);
        for(int j=0;j<sb.length();j++)
        {
            chars[j]=sb.charAt(j);
        }
        return sb.length();

        
    }
}