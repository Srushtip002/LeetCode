class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        int open = 0;
        int close = 0;

        generateParenthesis2("", open, close, n);

        return ans;
    }

    public void generateParenthesis2(String str, int open, int close, int n) {

        if (open == n && close == n) {
            ans.add(str);
            return;
        }

        if (open < n) {
            generateParenthesis2(str + "(", open + 1, close, n);
        }

        if (close < open) {
            generateParenthesis2(str + ")", open, close + 1, n);
        }
    }
}