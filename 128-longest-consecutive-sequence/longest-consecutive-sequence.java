import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            ans.add(num);
        }

        Collections.sort(ans);

        int max = 1;
        int currStreak = 1;

        for (int i = 1; i < ans.size(); i++) {

            if (ans.get(i) == ans.get(i - 1) + 1) {
                currStreak++;
            }
            else if (ans.get(i).equals(ans.get(i - 1))) {
                continue;
            }
            else {
                currStreak = 1;
            }

            max = Math.max(max, currStreak);
        }

        return max;
    }
}