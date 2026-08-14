class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;

        int maxArea = 0;

        while(left<right) {
            int width = right-left;

            int currArea = (width) *   
                     Math.min(heights[left],heights[right]);
            if(currArea>maxArea) {
                maxArea = currArea;
                System.out.println(left+" "+right);
            }

            if(heights[left]<heights[right]) left++;
            else right--;
        }

        return maxArea;
    }
}
