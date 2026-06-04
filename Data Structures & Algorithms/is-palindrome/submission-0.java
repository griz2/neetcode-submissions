class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("\\s", "");
        s1 = s1.replaceAll("\\p{Punct}", "");
        s1 = s1.toLowerCase();

        StringBuilder reverseString = new StringBuilder();

        reverseString.append(s1);

        reverseString.reverse();

        return s1.equals(reverseString.toString());

    }
}
