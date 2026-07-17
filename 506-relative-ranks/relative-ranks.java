class Solution {
    public String[] findRelativeRanks(int[] score) {
            int n = score.length;
        int[] original = score.clone();

    
        Arrays.sort(score);

        String[] ans = new String[n];

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (original[i] == score[j]) {

                    if (j == n - 1)
                        ans[i] = "Gold Medal";
                    else if (j == n - 2)
                        ans[i] = "Silver Medal";
                    else if (j == n - 3)
                        ans[i] = "Bronze Medal";
                    else
                        ans[i] = String.valueOf(n - j);

                    break;
                }
            }
        }

        return ans;
    }
}