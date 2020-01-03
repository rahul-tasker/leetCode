/****
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0

Example 3:
Input: head = [1]
Output: 1

Example 4:
Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
Output: 18880

Example 5:
Input: head = [0,0]
Output: 0
 

Constraints:
The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.

Runtime: 1 ms, faster than 19.54% of Java online submissions for Convert Binary Number in a Linked List to Integer.
Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
****/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int out = 0;
        Stack<Integer> stack = listToStack(head);
        int counter = 0;
        while(!stack.empty()) {
            int temp = stack.pop();
            if(temp == 1) {
                out += Math.pow(2, counter);
            }
            counter ++;
        }
        return out;
    }
    
    private Stack<Integer> listToStack(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        while(head!=null) {
            stack.push(new Integer(head.val));
            head = head.next;
        }
        return stack;
    }
}