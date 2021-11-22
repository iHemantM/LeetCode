class Solution {
    public int[] searchRange(int[] nums, int target) {
        
            int hi = nums.length - 1;
            int low = 0;
            int[] result = new int[2];
        
           // base case
            if(nums == null || nums.length == 0)
            	return new int[]{-1, -1 };
            
           //left side
            while(low < hi){
            	int mid = low + (hi - low) /2;
            	if(target > nums[mid]){
            		low = mid + 1;
            	}else{
            		hi = mid;
            	}
            }
            if(target == nums[low]){
        		result[0] = low;
            }else{
            	result[0] = -1;
            }
           
            //right side
            hi = nums.length - 1;
            while(low < hi){
            	int mid = (low + (hi - low) /2 ) + 1;
            	
            	if(target < nums[mid]){
            		hi = mid - 1;
            	}else{
            		low = mid;
            	}
            }   
            if(target == nums[hi]){
        		result[1] = hi;
            }else{
            	result[1] = -1;
            }
            
            return result;

    }
}