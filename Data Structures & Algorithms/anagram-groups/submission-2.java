class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String str : strs) {
            char[] sc = str.toCharArray();
            Arrays.sort(sc);
            String s = new String(sc);

            if (!hm.containsKey(s)) {
                hm.put(s, new ArrayList<>());
            }
            
            hm.get(s).add(str);
        }

        return new ArrayList<>(hm.values());
    }
}
