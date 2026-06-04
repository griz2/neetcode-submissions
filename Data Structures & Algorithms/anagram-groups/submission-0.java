class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // initialize a hashmap
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

        // for every string, sort the string
        for (String str:strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = new String(c);
            // if there is no key for the sorted string in the hashmap, create it
            if (hm.get(sortedStr)==null){
                hm.put(sortedStr, new ArrayList<>());
            }
            // add the original string into the sorted strings arraylist
            hm.get(sortedStr).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
