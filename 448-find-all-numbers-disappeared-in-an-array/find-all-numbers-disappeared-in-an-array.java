class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> ans = new ArrayList<>(); 
       int i =0;
       while(i<nums.length){
            int corr = nums[i] -1;
            if(nums[i] != nums[corr]){
                int temp = nums[i];
                nums[i] = nums[corr];
                nums[corr] = temp;
            }
            else{
                i++;
            }

        }
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;

    }
}