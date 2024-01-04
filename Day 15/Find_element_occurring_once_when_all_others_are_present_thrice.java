class Solution {
    static int singleElement(int[] arr , int N) {
        // step 1 - store the freq of each in map. 
        // step 2 - iterate through map find the element with freq = '1' and return the element.
        int key = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1){
                key = entry.getKey();
                break;  
            }
        }
        return key;
    }
}
