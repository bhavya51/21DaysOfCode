class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> nums;
    private Random random;
    
    public RandomizedSet() {
        this.map = new HashMap<Integer, Integer>();
        this.nums = new ArrayList<Integer>();
        this.random = new Random();
    }
    
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            nums.add(val);
            map.put(val, nums.size() - 1);
            return true;
        } 
        return false;
    }
    
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.remove(val);
            int lastVal = nums.remove(nums.size() - 1);
            if (lastVal != val) {
                nums.set(index, lastVal);
                map.put(lastVal, index);
            }
            return true;
        } 
        return false;
    }
    
    public int getRandom() {
        int rand = random.nextInt(nums.size());
        return nums.get(rand);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
