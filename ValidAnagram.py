# Given two strings s and t , write a function to determine if t is an anagram of s.

# Example 1:

# Input: s = "anagram", t = "nagaram"
# Output: true
# Example 2:

# Input: s = "rat", t = "car"
# Output: false
# Note:
# You may assume the string contains only lowercase alphabets.
# Runtime: 52 ms, faster than 54.62% of Python online submissions for Valid Anagram.
# Memory Usage: 9.6 MB, less than 35.14% of Python online submissions for Valid Anagram.

class Solution(object):
    def isAnagram(self, s, t):
        return sorted(s) == sorted(t)

        