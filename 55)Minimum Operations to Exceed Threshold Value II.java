class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq= new PriorityQueue<>();
        int operations=0;
        for(long ele:nums){
            pq.add(ele);
        }

        while(pq.size()>1&&pq.peek()<k){
            long x=pq.poll();
            long y=pq.poll();

            long newElement=x*2+y;

            pq.add(newElement);
            operations++;
        }
        return operations;

    }
}
