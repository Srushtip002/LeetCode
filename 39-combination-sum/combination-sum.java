class Solution {

    public List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>> l = new ArrayList<>();

        Arrays.sort(arr);

        find(0, target, new ArrayList<>(), arr, l);

        return l;
    }

    public void find(int idx, int target, List<Integer> ans,int[] coin, List<List<Integer>> l) {

        if (target == 0) {
            l.add(new ArrayList<>(ans));
            return;
        }

        for (int i = idx; i < coin.length; i++) {

            if (coin[i] <= target) {
                ans.add(coin[i]);
                find(i, target - coin[i], ans, coin, l);
                ans.remove(ans.size() - 1);
            }
        }
    }
}