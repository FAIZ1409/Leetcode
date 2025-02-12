class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxSum=-1;
        for(int ele:nums){
            int dig_sum=digitSum(ele);
            if(map.containsKey(dig_sum)){
                maxSum=Math.max(maxSum,map.get(dig_sum)+ele);
                map.put(dig_sum, Math.max(map.get(dig_sum), ele));
            }
            else{
                map.put(dig_sum,ele);
            }
            
        }

    return maxSum;
    }
    private int digitSum(int x){
        int sum=0;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }
}
