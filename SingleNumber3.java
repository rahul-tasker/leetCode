/*
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Example:

Input:  [1,2,1,3,2,5]
Output: [3,5]

Runtime: 7 ms, faster than 20.31% of Java online submissions
*/

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] output = new int[2];
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) == 1) {
                output[count] = key;
                count ++;
            }
        }
        return output;
    }
}