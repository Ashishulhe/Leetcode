class Solution {
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

            /*if  (  (String.valueOf(startChar).matches("^[AEIOUaeiou]$")) &&
                    (String.valueOf(endChar).matches("^[AEIOUaeiou]$"))  )
                    {
                        sb.setCharAt(start,endChar);
                        sb.setCharAt(end,startChar);
                        start++;
                        end--;
                    }
            else if( ! (String.valueOf(startChar).matches("^[AEIOUaeiou]$")))
            {
                start++;
            }
            else if( !String.valueOf(endChar).matches("^[AEIOUaeiou]$")) 
            {
                end--;
            }
            */
            
        }
        return sb.toString();
        
    }
}

/*
if ((startChar=='A'||startChar=='E'||startChar=='I'||startChar=='O'||startChar='U'||
            startChar=='a'||startChar=='e'||startChar=='i'||startChar=='o'||startChar='u'
            ) && 
                ((endChar=='A'||endChar=='E'||endChar=='I'||endChar=='O'||endChar='U'||
            endChar=='a'||endChar=='e'||endChar=='i'||endChar=='o'||endChar='u'
                )  )

            else
           
 */