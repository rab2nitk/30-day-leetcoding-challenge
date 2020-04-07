class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0 ;
        int max_so_far = Integer.MIN_VALUE;
        if(nums.length==1){
            if(nums[0]<0) return nums[0];
            if(nums[0]==1) return 1;
            if(nums[0] ==0) return 0;
        }
        for(int i=0;i<nums.length;i++){
            max = max + nums[i];
            if(max_so_far<max){
                max_so_far = max;
            }
            if(max<=0){
                max = 0;
                
            }
        }
        return max_so_far;
    }
}