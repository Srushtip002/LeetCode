class Solution {

    List<Integer> l = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {

        for (int i = 1; i <= 9; i++) {
            create(i, n);
        }

        return l;
    }

    public void create(int num, int n) {

        if (num > n)
            return;

        l.add(num);

        for (int i = 0; i <= 9; i++) {
            create(num * 10 + i, n);
        }
    }
}