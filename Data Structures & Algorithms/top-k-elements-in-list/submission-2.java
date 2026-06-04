class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        int[] topK = new int[k];
        
        for(int i=0; i<topK.length; ++i) {
            int max = 0;
            int keyMax = 0;
            for (int key : hm.keySet()){
                if (hm.get(key)>max) {
                    max = hm.get(key);
                    keyMax = key;
                }
            }
            topK[i]=keyMax;
            hm.remove(keyMax);
        }
        
        return topK;
    }
}
