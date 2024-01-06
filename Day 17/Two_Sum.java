class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        int res[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            arr.put(nums[i], i);
        }
        for(int i = 0; i<nums.length; i++){
            if(arr.containsKey(target - nums[i]) && arr.get(target - nums[i])!=i){
                res[0] = i;
                res[1] = arr.get(target - nums[i]);
            }
        }
        return res;
    }
}
