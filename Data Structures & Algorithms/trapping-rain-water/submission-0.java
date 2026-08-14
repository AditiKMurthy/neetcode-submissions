class Solution {
    public int trap(int[] height) {
        int[] prefixMax = new int[height.length];
        int[] suffixMax = new int[height.length];
        int trap = 0;

        int max=0;
        for(int i=0; i<height.length; i++) {
            if(height[i]>max) max = height[i];
            prefixMax[i] = max;
        }

        max=0;
        for(int i=height.length-1; i>=0; i--) {
            if(height[i]>max) max = height[i];
            suffixMax[i] = max;
        }

        for(int i=0; i<height.length; i++) {
            int min = Math.min(prefixMax[i],suffixMax[i]);
            if(min-height[i]>0) trap += (min-height[i]);
        }

        return trap;
    }
}
