// use Hash, learn about it before moving on

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i=0; i<nums.length; ++i){
            Integer c = hm.get(nums[i]);

            if(c==null){
                hm.put(nums[i], 1);
            }

            else {
                return true;
            }
        }
        
        return false;
    }
}
