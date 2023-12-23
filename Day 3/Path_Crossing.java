class Solution {
    public static boolean isPathCrossing(String path) {
        // HashSet for tracking
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        int i = 0, j = 0; // i and j for every char
        ArrayList<Integer> origin = new ArrayList<>();
        Collections.addAll(origin, i, j);
        set.add(origin);
        for (int s = 0; s < path.length(); s++) {
            if(path.charAt(s)=='N') j++;
            else if(path.charAt(s)=='S') j--;
            else if(path.charAt(s)=='E') i++;
            else i--;
            ArrayList<Integer> coordinates = new ArrayList<>();
            Collections.addAll(coordinates, i, j);// added to array list
            if(set.contains(coordinates)){
                return true;
            }
            set.add(coordinates);
        }
        return false;
    }
}
