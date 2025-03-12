class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int pos=0,neg=0,max=-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
            if(nums[i]>0){
                pos++;
            }
            else{
                neg++;
            }
            }
        }
        max=Math.max(pos,neg);
        return max;

    }
}
