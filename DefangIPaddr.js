/****
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 

Constraints:
The given address is a valid IPv4 address.


Runtime: 56 ms, faster than 48.51% of JavaScript online submissions for Defanging an IP Address.
Memory Usage: 33.7 MB, less than 100.00% of JavaScript online submissions for Defanging an IP Address.
****/

/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    var out = "";
    for(i=0; i<address.length;i++) {
        var c = address.charAt(i);
        if(c==='.') {
            out = out.concat('[', c, ']');
        }
        else {
            out = out.concat(c);
        }
    }
    return out;
};