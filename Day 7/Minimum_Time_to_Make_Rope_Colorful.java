class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minTime = 0;
        int i = 0; int j = 1;
        while(i<colors.length() && j<colors.length()){
            if(colors.charAt(i)==colors.charAt(j)){ // balloons at i and jth position are same
                if(neededTime[i] == neededTime[j]){
                    minTime += neededTime[i]; // if time for both the balloons is same
                } else if(neededTime[i] < neededTime[j]) {
                    minTime += neededTime[i]; // if time for ith balloon is less, pop that balloon
                    i = j; // update the position of i
                } else{
                    minTime += neededTime[j]; // if the jth balloon's time is less, pop jth balloon
                }
                j++; //update position of j after checking the suitable case
            }
            else{ // balloons at i and jth positions are not same
                i = j; //update i
                j++; //update j
            }
        }
        return minTime; // return time
    }
}
