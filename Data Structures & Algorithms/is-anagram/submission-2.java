class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character, Integer> sCharCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tCharCount = new HashMap<Character, Integer>();

        for(int i = 0 ; i<s.length() ; ++i) {
            sCharCount.put(s.charAt(i), sCharCount.getOrDefault(s.charAt(i), 0) + 1 );
            tCharCount.put(t.charAt(i), tCharCount.getOrDefault(t.charAt(i), 0) + 1 );
        }

        return sCharCount.equals(tCharCount);
    }   
}
