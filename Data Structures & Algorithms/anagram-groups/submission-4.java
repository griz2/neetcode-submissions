class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // sorted string, unsorted strings
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for (int i=0; i<strs.length; i++) {
            char[] strChars = strs[i].toCharArray();
            Arrays.sort(strChars);
            String sortedStr = new String(strChars);
            
            if(!hm.containsKey(sortedStr)) {
                hm.put(sortedStr, new ArrayList<>());
            }
            
            hm.get(sortedStr).add(strs[i]);
        }

        ArrayList<List<String>> retList = new ArrayList<>();

        for (String str : hm.keySet()) {
            retList.add(hm.get(str));
        }

        return retList;
    }
}
