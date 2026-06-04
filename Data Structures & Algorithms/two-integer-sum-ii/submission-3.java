class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i = 1;
        int j = numbers.length;

        while(numbers[i-1]+numbers[j-1]!=target) {
            if(numbers[i-1]+numbers[j-1]>target){
                j--;
            }
            else {
                i++;
            }
            if(i>=j) {
                i--;
            }
        }

        return new int[]{i,j};

    }
}
