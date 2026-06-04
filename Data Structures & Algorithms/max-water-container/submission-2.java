class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length - 1;

        int max = (Math.min(heights[l],heights[r])*(r-l)); 

        while(l<r) {
            if(heights[l]<heights[r]) {
                l++;
            }
            else {
                r--;
            }

            max = Math.max(max,Math.min(heights[l],heights[r])*(r-l));
        }

        return max;
    }
}
