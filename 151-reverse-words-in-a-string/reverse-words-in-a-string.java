class Solution {
    public String reverseWords(String s) {

        String[] arr = s.trim().split("\\s+");
  String ans="";

         for(int i=0; i<arr.length; i++){
             ans = arr[i] + " " + ans;
         }
         return ans.trim();
    }}