/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]
The median is 2.0

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5
*/


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = mergeArrays(nums1, nums2);
        return findMedian(nums);
    }
    
    public int[] mergeArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) 
                nums3[k++] = nums1[i++]; 
            else
                nums3[k++] = nums2[j++]; 
        }
        while (i < n1) 
            nums3[k++] = nums1[i++]; 
      
        while (j < n2) 
            nums3[k++] = nums2[j++]; 
        return nums3;
    }
    
    public double findMedian(int[] nums) {
        int length = nums.length;
        int mid = length/2;
        if(length % 2 != 0) {
            return new Double(nums[mid]);
        }
        else {
            double avg = (nums[mid - 1] + nums[mid]) / 2.0;
            return avg;
        }
    }
}