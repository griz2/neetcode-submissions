class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;

        for (int num : nums){
            if(num!=0){ 
                prod*=num; 
            }
            else { 
                zeroCount++;
            }
        }

        // if there is more than 1 zero, the product will always be 0
        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int[] products = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(zeroCount > 0) {
                if(nums[i]==0) {
                    products[i]=prod;
                }
                else {
                    products[i]=0;
                }
            }
            else {
                products[i]=prod/nums[i];
            }
        }

        return products;
    }
}  
