class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        int leftHand = 1;

        for(int i=0; i<n; i++) {
            result[i] = leftHand;
            leftHand *= nums[i];
        }

        int rightHand = 1;

        for(int i=n-1; i>=0; i--) {
            result[i] *= rightHand;
            rightHand *= nums[i];
        }

        return result;
    }
}  
