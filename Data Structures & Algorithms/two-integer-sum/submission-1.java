class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;++i){
            int sum2 = target-nums[i];
            
            Integer c = hm.get(sum2);

            if (c!=null){
                return new int[] {c,i};
            }
            hm.put(nums[i],i);
        }
        return null;
    }
}
