class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> numsTemp = new ArrayList<>();
        int i = 0, j = 0, idx = 0;
        while(i < m && j < n){
            if(nums1[i]<=nums2[j]){
                numsTemp.add(nums1[i]);
                i++;
            } else {
                numsTemp.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            numsTemp.add(nums1[i]);
            i++;
        }
        while(j<n){
            numsTemp.add(nums2[j]);
            j++;
        }
        for (int k = 0; k < nums1.length; k++) {
            nums1[k] = numsTemp.get(k);
        }
    }
}
