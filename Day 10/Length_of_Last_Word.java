class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int idx = s.length()-1;
        while(idx>=0){
            if(s.charAt(idx) != ' '){
                count++;
                idx--;
            } else if (s.charAt(idx) == ' ' && count == 0){
                idx--;
            } else{
                break;
            }
        }
        return count;
    }
}
