class Solution {
List<String> l = new ArrayList<>();
String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

public List<String> letterCombinations(String digits) {

    if (digits.length() == 0)
        return l;

    comb(0, digits, "");
    return l;
}

public void comb(int i, String digits, String current) {

    if (i == digits.length()) {
        l.add(current);
        return;
    }

    int idx = digits.charAt(i) - '0';
    String s = arr[idx];

    for (int j = 0; j < s.length(); j++) {
        comb(i + 1, digits, current + s.charAt(j));
    }
}
    }
