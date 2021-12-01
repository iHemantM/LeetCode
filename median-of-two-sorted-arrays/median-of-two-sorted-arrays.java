class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length + nums2.length];
        
        int i = 0; 
        int j = 0; 
        int k = 0;
        
        while(i < nums1.length) {
            result[i] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length) {
            result[k++] = nums2[j++];
        }
        
        Arrays.sort(result);
        
        
        int n = result.length;
        
        if(n % 2 != 0) {
            return (double)result[n / 2];
        } else {
            return (double)(result[(n - 1) / 2] + result[n / 2]) / 2.0;
        }
        
    }
}