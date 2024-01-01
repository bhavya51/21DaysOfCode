class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int kid = g.length-1, cookie = s.length-1, maxCount = 0 ;
        while(kid>=0 && cookie>=0){
            if(s[cookie]>=g[kid]){
                cookie--;
                kid--;
                maxCount++;
            } else{
                kid--;
            }
        }
        return maxCount;
    }
}
