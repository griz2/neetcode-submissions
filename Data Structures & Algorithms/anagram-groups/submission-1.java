class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // initialize a hashmap
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

        // for every String, sort the String
        for (String str:strs){
            //convert the String into a char array, sort it, then convert back to String
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = new String(c);
            
            // if there is no key for the sorted String in the hashmap, create it
            if (hm.get(sortedStr)==null){
                hm.put(sortedStr, new ArrayList<>());
            }

            // add the original String into the sorted Strings arraylist
            hm.get(sortedStr).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
