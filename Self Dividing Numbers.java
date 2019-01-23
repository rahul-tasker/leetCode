/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<Integer>();
        for(int i = left; i <= right; i ++) {
            int[] array = intToArray(i);
            if(isSelfDividing(i, array)) {
                output.add(i);
            }
        }
        return output;
    }
    
    public int[] intToArray(int guess) {
        String temp = Integer.toString(guess);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }
        return newGuess;
    }
    
    public boolean isSelfDividing(int i, int[] array) {
        
        for(int j = 0; j < array.length; j ++) {
            if(array[j] == 0) {
                return false;
            }
            if(i % array[j] == 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }   
}