class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen=new HashSet<>();
        int left=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            while(seen.contains(s.charAt(i)))
            {
                seen.remove(s.charAt(left++));
            }
            seen.add(s.charAt(i));
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}