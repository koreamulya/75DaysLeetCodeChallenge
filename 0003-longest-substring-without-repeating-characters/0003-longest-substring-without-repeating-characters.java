class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0,right=0,maxLen=0;
        while(right<s.length()){
            if(hash[s.charAt(right)]!=-1){
                if(hash[s.charAt(right)]>=left){
                    left=hash[s.charAt(right)]+1;
                }
            }
            int len=right-left+1;
            maxLen=Math.max(len,maxLen);
            hash[s.charAt(right)]=right;
            right++;
        }
        return maxLen;
    }
}