class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int value=ch;
            String bin=String.format("%8s",
                Integer.toBinaryString(value)).replace(' ','0');

            sb.append(bin);
        }

        //now check if the string is plindrom or not
        int start=0;
        int end=sb.length()-1;
        while(start<end)
        {
            if(sb.charAt(start)!=sb.charAt(end))
            {
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        return true;
    }
}