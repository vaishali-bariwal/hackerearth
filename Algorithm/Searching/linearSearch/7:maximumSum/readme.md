You are given an array of integers 
A
, you need to find the maximum sum that can be obtained by picking some non-empty subset of the array. If there are many such non-empty subsets, choose the one with the maximum number of elements. Print the maximum sum and the number of elements in the chosen subset.

Input:

The first line contains an integer 
N
, denoting the number of elements of the array. Next line contains 
N
 space-separated integers, denoting the elements of the array.

Output:

Print 
2
 space-separated integers, the maximum sum that can be obtained by choosing some subset and the maximum number of elements among all such subsets which have the same maximum sum.

Constraints:


1
≤
N
≤
10
5


−
10
9
≤
A
i
≤
10
9
SAMPLE INPUT 
5
1 2 -4 -2 3
SAMPLE OUTPUT 
6 3
Explanation
The chosen subset is {1, 2, 3}.