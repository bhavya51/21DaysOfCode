class Solution {
    public int removeDuplicates(int[] nums) {
        // pointer to iterate through array and j to keep track of position
        int j = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j; //gives the index no. aka (K)
    }
}
