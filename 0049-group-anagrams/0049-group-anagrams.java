class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , List<String>> map = new HashMap<>();
        for(String word:strs)
        {
           //pehle word ko sort karo
           //convert in cgar array
           char arr[]= word.toCharArray();

           //sort that array
           Arrays.sort(arr); 
           
           //again make word but now we get sorted word
           String key=new String(arr);

           //now check if our key is present or not
           if(!map.containsKey(key)) // matlab agar key present nahi hai to use add kar 
           {
            map.put(key, new ArrayList<>());
           }
           //aur ab us key liye jo list banaya hai usme apna word addd kar
           map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}