class Solution {
    public int minimumDeletions(int[] nums) {
        
        if(nums.length == 1) return 1;
        
        int min = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[min] > nums[i]) min = i;
        }
        
        int max = 0;
        for(int i = 1; i <nums.length; i++) {
            if(nums[max] < nums[i]) max = i;
        }
        
        
        return Math.min(Math.min(nums.length - min, min + 1) + Math.min(nums.length - max, max + 1), Math.min(Math.max(nums.length - min,                       nums.length - max), Math.max(min, max) + 1));
        
    }
}