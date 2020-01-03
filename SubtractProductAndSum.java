/***

Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21

Runtime: 1 ms, faster than 14.99% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 32.9 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
***/

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        Stack<Integer> stack = new Stack<Integer>();
        while(n > 0) {
            stack.push(new Integer(n%10));
            n = n / 10;
        }
        while(!stack.empty()) {
            int temp = stack.pop();
            sum += temp;
            prod *= temp;
        }
        return prod - sum;
    }
}