class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0; //start at 0th idx
        for(int i = 0; i < nums.length; i++){
            if(maxReach<i) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }  
}
