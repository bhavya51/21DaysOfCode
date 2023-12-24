class Solution {
    public int minOperations(String s) {
        int len = s.length(), count = 0;
        if (len == 1) return 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0 && s.charAt(i) == '1') count++;
            if (i % 2 == 1 && s.charAt(i) == '0') count++;
        }
        return Math.min(count, len - count);
    }
}
