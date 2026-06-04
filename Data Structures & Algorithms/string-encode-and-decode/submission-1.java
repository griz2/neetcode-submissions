class Solution {

    public String encode(List<String> strs) {
        StringBuilder joined = new StringBuilder();

        for (String str : strs) {
            joined.append(str.length()).append('#').append(str);
        }

        return joined.toString();
    }

    public List<String> decode(String str) {
        List<String> ret = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length;
            ret.add(str.substring(i,j)); // i is inclusive, j is exclusive
            i = j;
        }

        return ret;
    }
}
