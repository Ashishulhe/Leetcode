class Solution 
{
    public String reverseVowels(String s)
    {
        //fisrt create boolean array
        boolean isVowel[]=new boolean[128];
        //now for vowels set true;
        for(char c:"aeiouAEIOU".toCharArray())
        {
            isVowel[c]=true;
        }
        
        //now convert the string to charArray
        char arr[]=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            boolean isStartVowel=isVowel[arr[start]];
            boolean isEndVowel=isVowel[arr[end]];
            if(isStartVowel && isEndVowel) //both are vowel swap
            {
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(!isStartVowel)
            {
                start++;
            }
            else if(!isEndVowel)
            {
                end--;
            }
            
        }
        return new String(arr);
    }
}

/*class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        StringBuilder sb= new StringBuilder(s);
        
        while(start<end)
        {
            char startChar=sb.charAt(start);
            char endChar=sb.charAt(end);
            if( "AEIOUaeiou".indexOf(startChar)!=-1  && "AEIOUaeiou".indexOf(endChar)!=-1 )
            {
                sb.setCharAt(start,endChar);
                sb.setCharAt(end,startChar);
                start++;
                end--;

            }
            else if("AEIOUaeiou".indexOf(startChar)==-1 )
            {
                start++;
            }
            else if("AEIOUaeiou".indexOf(endChar)==-1 )
            {
                end--;
            }

            // if  (  (String.valueOf(startChar).matches("^[AEIOUaeiou]$")) &&
            //         (String.valueOf(endChar).matches("^[AEIOUaeiou]$"))  )
            //         {
            //             sb.setCharAt(start,endChar);
            //             sb.setCharAt(end,startChar);
            //             start++;
            //             end--;
            //         }
            // else if( ! (String.valueOf(startChar).matches("^[AEIOUaeiou]$")))
            // {
            //     start++;
            // }
            // else if( !String.valueOf(endChar).matches("^[AEIOUaeiou]$")) 
            // {
            //     end--;
            // }
            
            
        }
        return sb.toString();
        
    }
}
*/

/*
if ((startChar=='A'||startChar=='E'||startChar=='I'||startChar=='O'||startChar='U'||
            startChar=='a'||startChar=='e'||startChar=='i'||startChar=='o'||startChar='u'
            ) && 
                ((endChar=='A'||endChar=='E'||endChar=='I'||endChar=='O'||endChar='U'||
            endChar=='a'||endChar=='e'||endChar=='i'||endChar=='o'||endChar='u'
                )  )

            else
           
 */