class Solution {
    public int findPeakElement(int[] nums) {
        int peak=0;
        int n=nums.length;
        int l=0,r=n-1;
        if(n==1) return 0;

        if(nums[l]>nums[l+1]){
            return l;
        }
        else if(nums[r]>nums[r-1]){
             return r;
        }

        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                peak=mid;
            }

            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }

            else{
                r=mid-1;
            }            
        }
        return peak;
        
    }
}
