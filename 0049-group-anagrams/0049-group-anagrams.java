class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs==null) return new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();

        for(String s:strs){
            int[] freq=new int[26];
            for(char ch:s.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int count:freq){
                sb.append("#").append(count);
            }
            String key=sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);


        }
        return new ArrayList<>(map.values()); 
    }
}