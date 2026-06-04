class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();

        for (int n:nums){
            if (h.contains(n)==true){
                return true;
            }
            else{
                h.add(n);
            }
        }
        return false;
    }
}