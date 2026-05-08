class Solution {
    public boolean canJump(int[] nums) {
        int finalPosition = nums.length-1;

        // Using the greedy approach
        for(int idx = finalPosition - 1; idx >= 0; idx--){
            
            // If you can reatch the final positin.
            // Update the finalPosition.

            if(idx + nums[idx] >= finalPosition){
                finalPosition = idx;
            }
        }

        return finalPosition == 0;
    }
}