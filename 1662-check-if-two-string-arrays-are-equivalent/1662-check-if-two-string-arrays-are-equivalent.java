class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int i=0;// for traversing word1
        int j=0; //for traversing word2
        int n=0; // for accessing character of word1 any index
        int m=0;  // for accessing character of word2 any index
        while(i<word1.length && j<word2.length)
        {
            //compare character 
            if(word1[i].charAt(n)  !=word2[j].charAt(m)) //if not equal return false
            {
                return false;
            }
            n++;
            m++;
            if(n==word1[i].length())
            {
                i++; //increse i cause the String eneded next string  now
                n=0;  // reset index cause String index start from 0
                
            }
            if(m==word2[j].length())
            {
                j++; //increse i cause the String eneded next string  now
                m=0;  // reset index cause String index start from 0   
            }
        }
        if( (i==word1.length && j<word2.length) || (j==word2.length && i<word1.length) )
        {
            return false;
        }
        return true;
    }
}
/*
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //create two stringBuilder 
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        for(int i=0;i<word1.length;i++)
        {
            sb1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++)
        {
            sb2.append(word2[i]);
        }
        return sb1.toString().equals(sb2.toString());
    }
}

 */