# Zero Sum Elements

## Problem Statement
Write a program that takes as input an array of positive and negative numbers (0 excluded). The objective is to
return those items from the array whose sum is 0. If no such items exist return “No Elements found”

### Example
Example: For an input array [-4, 1, 3, -2, -1],
one of the possible results would be 3, -2, -1 since their sum is 0.

* Additional Examples
   
  Example 2: <br>
  Input:  [2, 4, -6, 1, -3, 7, 0] <br>
  Output: [2, 4, -6] <br>
  Explanation: The elements [2, 4, -6] have a sum of 0. <br>

**Note**: If there are more than 1 combination of such items, you can return any 1 of them.


## Program Explanation
The program follows these steps to find the zero sum elements:

1. Create an empty list res to store the zero sum elements.
2. Create a HashMap named map to store the running sum and its corresponding index.
3. Initialize a variable sum to keep track of the running sum.
4. Iterate over the input array:

   * Increment the sum by the current element arr[i].
   * Check if the current element arr[i] is zero. If so, add it to the res list and return the res list.
   * Check if the current sum is zero. If so, add all the elements from index 0 to i in the arr array to the res list and return the res list.
   * Check if the map contains the sum as a key. If it does, it means that there is a subarray with a sum of zero. In that case, add all the elements from index map.get(sum) + 1 to i in the arr array to the res list and return the res list.
   * Store the current sum and its corresponding index i in the map.
   
5. If no zero sum elements are found, the res list will be empty. Return the res list.
   
## Time Complexity
   The time complexity of this program is **O(n)**, where n is the number of elements in the input array. This is because the program iterates over the array once, performing constant time operations for each element.

## Space Complexity
   The space complexity of this program is **O(n)**, where n is the number of elements in the input array. This is because the program uses additional space to store the **res** list and the **map** HashMap, both of which can potentially store up to n elements in the worst case.