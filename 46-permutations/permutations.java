class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
    
        subset(new ArrayList<>(),nums,l);

    return l;
    }
    void subset(List<Integer> ans, int [] arr, List<List<Integer>>l){
        if(ans.size() == arr.length){
            l.add(new ArrayList<> (ans));

            return;
        }

        for(int i=0; i < arr.length; i++){
            if(!ans.contains(arr[i])){
                ans.add(arr[i]);

                subset(ans,arr,l);
                ans.remove(ans.size()-1);
            }
        }
        
    }}