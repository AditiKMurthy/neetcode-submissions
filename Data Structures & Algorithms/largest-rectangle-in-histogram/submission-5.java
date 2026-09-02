class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int n=heights.length;

        if(heights.length==0 || heights == null) return 0;

        for(int i=0; i<=n; i++) {
            int currHeight = (i==n)? 0 : heights[i];

            while(!stack.isEmpty() && heights[stack.peek()]>currHeight) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i-1-stack.peek();

                max = Math.max(max, height*width);
            }

            stack.push(i);
        }


        return max;
    }
}
