/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:
Input: "race a car"
Output: false

Runtime: 23 ms, faster than 16.86% of Java online submissions
*/

class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.toLowerCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        String reverse = new StringBuilder(newS).reverse().toString();
        return (newS.equals(reverse));
    }
}