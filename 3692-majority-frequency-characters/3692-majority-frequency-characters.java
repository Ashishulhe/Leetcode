class Solution {
    public String majorityFrequencyGroup(String s) {

        int arr[]= new int[26];
        for(int i=0;i<s.length();i++)
         {
            arr[s.charAt(i)-'a']=arr[s.charAt(i)-'a']+1;
         }

        HashMap<Integer,String> map= new HashMap<>();
        for(int i=0;i<26;i++)
        {
            int key=arr[i];
            char ch=(char)(97+i);
            if(arr[i]>0)
            {
                if (map.containsKey(key))
                {
                    String value = map.get(key);
                    value = value + ch;
                    map.put(key, value);
                } 
                else
                {
                    map.put(key, String.valueOf(ch));
                }
            }  
        }
        //now traverse the save 3 thing 
        // String-->value, string length , freq-->key
        int freq=0;
        String str=null;
        int strlength=0;

        for(Map.Entry<Integer,String>entry:map.entrySet())
        {
            //first check String length
            String st=entry.getValue();//its str  wat present in map
            int len=st.length(); // its 
            int f=entry.getKey(); // its frequency
            if(len>strlength)
            {
                str=st;
                strlength=len;
                freq=f;
            }
            else if(len==strlength && f>freq)
            {
                str=st;
                strlength=len;
                freq=f;
            }
        }
       return str;
        
    }
}