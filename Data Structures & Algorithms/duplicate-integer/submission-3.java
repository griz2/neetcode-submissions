class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();

        for (int i=0;i<nums.length;++i){
            if (h.contains(nums[i])){
                return true;
            }
            else{
                h.put(i,nums[i]);
            }
        }
        return false;
    }
}