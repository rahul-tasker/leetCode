# Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

# Each letter in the magazine string can only be used once in your ransom note.

# Note:
# You may assume that both strings contain only lowercase letters.

# canConstruct("a", "b") -> false
# canConstruct("aa", "ab") -> false
# canConstruct("aa", "aab") -> true

# Runtime: 48 ms, faster than 85.44% of Python online submissions for Ransom Note.

class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        for char in ransomNote:
            if char in magazine:
                index = magazine.find(char)
                magazine = magazine[:index] + magazine[index+1:]
            else:
                return False
        return True
        