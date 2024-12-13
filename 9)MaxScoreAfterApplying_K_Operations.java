import java.util.PriorityQueue;

class Solution {
    
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        // Add all elements of the array to the heap
        for (int num : nums) {
            maxHeap.add(num);
        }
        
        long score = 0; // To store the final score
        
        // Perform k operations
        for (int i = 0; i < k; i++) {
            // Extract the maximum element (top of the heap)
            int maxValue = maxHeap.poll();
            
            // Add the maximum value to the score
            score += maxValue;
            
            // Compute the new value after ceil(maxValue / 3)
            int newValue = (int) Math.ceil(maxValue / 3.0);
            
            // Insert the updated value back into the heap
            maxHeap.add(newValue);
        }
        
        return score;
    }
}
