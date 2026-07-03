class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> l = new ArrayList<>();
        pp(s, new ArrayList<>(), l);
        return l;
    }

    public static void pp(String s, List<String> ans, List<List<String>> l) {

        if (s.length() == 0) {
            l.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String prefix = s.substring(0, i + 1);

            if (ispal(prefix)) {
                ans.add(prefix);
                pp(s.substring(i + 1), ans, l);
                ans.remove(ans.size() - 1);
            }
        }
    }

    public static boolean ispal(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}