class Solution {
    public boolean isAnagram(String s, String t) {
        // first, check if the strings have equal length
        if(s.length()!=t.length()){
            return false;
        }
        
        // create 2 hashmaps for 2 strings, stored as character and integer, to store the # of times a character shows up in a string.
        HashMap<Character, Integer> sCharCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tCharCount = new HashMap<Character, Integer>();

        // for each character in the string, add the character count to the hashmap.
        for(int i = 0 ; i<s.length() ; ++i) {
            sCharCount.put(s.charAt(i), sCharCount.getOrDefault(s.charAt(i), 0) + 1 );
            tCharCount.put(t.charAt(i), tCharCount.getOrDefault(t.charAt(i), 0) + 1 );
        }

        // if the character counts are equal for both strings, return true. otherwise, false.
        return sCharCount.equals(tCharCount);
    }   
}
