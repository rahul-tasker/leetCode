/****
Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:
Input: n = 3
Output: [-1,0,1]

Example 3:
Input: n = 1
Output: [0]
 

Constraints:
1 <= n <= 1000

Runtime: 76 ms, faster than 8.37% of JavaScript online submissions for Find N Unique Integers Sum up to Zero.
Memory Usage: 35.1 MB, less than 100.00% of JavaScript online submissions for Find N Unique Integers Sum up to Zero.
****/


/**
 * @param {number} n
 * @return {number[]}
 */
var sumZero = function(n) {
    if(n===1) {
        return [0];
    }
    else {
        var out = new Array(n);
        var count = 1;
        if(n%2==0) {
            for(i=0; i<n; i+=2) {
                out[i] = count;
                out[i+1] = parseInt('-'+count.toString(), 10);
                count ++;
            }
            // 1, -1, 2, -2 ...
        }
        else {
            out[0] = 0;
            for(i=1; i<n; i+=2) {
                out[i] = i;
                out[i+1] = parseInt('-'+i.toString(), 10);
                count ++;
            }
            // 0, 1, -1, 2, -2...
        }
        return out;
    }
};