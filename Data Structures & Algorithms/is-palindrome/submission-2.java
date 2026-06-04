class Solution {
    public boolean isPalindrome(String s) {
        String str = s;
        for(int i = 0; i<str.length(); i++){
            if(!(str.charAt(i)>='a' && str.charAt(i)<='z' ||
                 str.charAt(i)>='A' && str.charAt(i)<='Z' ||
                 str.charAt(i)>='0' && str.charAt(i)<='9'))
            {
                str = str.replace(str.charAt(i),' ');
            }
        }

        str = str.replaceAll(" ", "");
        str = str.toLowerCase();

        int i = 0;
        int j = str.length()-1;

        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
        
    }
}
