class Solution
{
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> indices = new ArrayList<>();

        int M = pat.length();
        int N = txt.length();

        // Iterate through the text string
        for (int i = 0; i <= N - M; i++) {
            int j;
            // Check for pattern match
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            // If the whole pattern is found, add index (one-based) to the list
            if (j == M) {
                indices.add(i + 1); // Adding index (one-based)
            }
        }

        return indices;
    }
}
