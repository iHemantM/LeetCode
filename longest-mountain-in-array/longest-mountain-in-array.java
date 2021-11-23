class Solution {
    public int longestMountain(int[] arr) {
        
        int longestMount = 0;
        
        if(arr.length < 3) {
            return longestMount;
        }
        
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                
                int left = i - 1;
                int right = i + 1;
                
                while(left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                
                while(right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                } 
                
                longestMount = Math.max(right - left + 1, longestMount);
            }
        }
        return longestMount;
    }
}