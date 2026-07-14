class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int max = 0;
        int ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<=n-1;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    int cnt = map.get(nums[i]);
                    map.put(nums[i],cnt+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
        }
       for(int num : map.keySet()){

    int curr = map.get(num);

    if(curr > max){
        max = curr;
        ans = num;
    }
    else if(curr == max && num < ans){
        ans = num;
    }
}
     return ans;
        
    }
}