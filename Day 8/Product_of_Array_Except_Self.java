class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[] = new int[nums.length];
        int before[] = new int[nums.length];
        int after[] = new int[nums.length];
        before[0] = 1;
        after[nums.length-1] = 1;     
        for(int i = 1; i<nums.length; i++){
            before[i] = before[i-1]*nums[i-1];
        }
        for(int i = nums.length-2; i>=0; i--){
            after[i] = after[i+1]*nums[i+1];
        }
        for(int i = 0; i<nums.length; i++){
            p[i] = before[i]*after[i];
        }
        return p;
    }
}
