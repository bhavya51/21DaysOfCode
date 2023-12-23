class Solution {
    public int countOccurence(int[] arr, int n, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            counts.put(arr[i], counts.getOrDefault(arr[i],0)+1);
            if (counts.get(arr[i])==n/k+1) {
                count++;
            }
        }
        return count;
    }
}
