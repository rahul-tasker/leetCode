/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21
*/

class Solution {
    public int reverse(int x) {
        String num = Integer.toString(x);
        int ans = 0;
        boolean switched = x<0 ? true : false;
        x *= switched ? -1 : 1;
        for (int i = 0; i<num.length(); i++) {
            char digit = num.charAt(i);
            ans += switched ? (digit - '0') * Math.pow(10, i-1) : (digit - '0') * Math.pow(10, i); 
        }
        return ans < Integer.MAX_VALUE && ans > Integer.MIN_VALUE ? switched ? ans * -1 : ans : 0;
    }
}