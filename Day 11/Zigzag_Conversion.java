class Solution {
    public String convert(String s, int numRows) {
        //base case if numRows == 1
        if(numRows==1) return s;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<numRows; i++){ 
            //for each row we calculate south elements and north elements
            int idx = i;
            int south = 2*(numRows-1-i);
            int north = 2*i;
            boolean goingDownwards = true; // to track the direction
            while(idx < s.length()){
                sb.append(s.charAt(idx));
                if(i==0){
                    idx += south;
                } else if(i==numRows-1){
                    idx += north;
                } else{
                    if(goingDownwards){
                        idx += south;
                    } else{
                        idx += north;
                    }
                    goingDownwards = !goingDownwards;
                }
            }
        }
        return sb.toString();
    }
}
