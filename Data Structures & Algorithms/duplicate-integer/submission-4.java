class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i=0;i<nums.length;++i){
            if (h.get(nums[i])!=null){
                return true;
            }
            else{
                h.put(nums[i],i);
            }
        }
        return false;
    }
}