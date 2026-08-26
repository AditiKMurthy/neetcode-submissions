class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[n];

        for(int i=0; i<n; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]) {
                int popIdx = stack.pop();
                result[popIdx] = i-popIdx;
            }
            stack.push(i);
        }

        return result;
    }
}
