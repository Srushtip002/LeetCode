class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        int i =0;

        sort(i,s,n);

    }

    public static void sort(int i,  char[] s, int n){
        if(i>=n){
            return;
        }

        char temp = s[i];
        s[i] = s[n];
        s[n] = temp;
        sort(i+1,s, n-1);

    }


}