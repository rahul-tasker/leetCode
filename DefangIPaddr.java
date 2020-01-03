/***
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Defanging an IP
***/

class Solution {
    public String defangIPaddr(String address) {
        String output = "";
        for(int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(c == '.') {
                output += "[.]";
            }
            else {
                output += c;
            }
        }
        return output;
    }
}