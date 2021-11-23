class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int element = 0;
        
        for(int i = 0; i < nums.length; i++) {
            element = element ^ nums[i];
        }
        
        return element;
    }
}