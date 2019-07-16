Given an array of N numbers, you have to report the Sum of bitwise AND of all possible subsets of this array. As answer can be large, report it after taking mod with 109+7.

Input:
First line contains a number T denoting the number of test cases.

First line of each test case contains a number N denoting the number of elements in the array. 
Second line contains the N elements of the array.

Output:
For each test case output a single number denoting the Sum of bitwise AND of all possible subsets of the given array.

Input Constraints:

1<=T<=10
1<=N<=105
1<=a[i]<=109

SAMPLE INPUT 
1
3
1 2 3
SAMPLE OUTPUT 
9
Explanation
For [1, 2, 3], all possible subsets are {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}

The sum of AND of these subsets are, 1 + 2 + 3 + 0 + 1 + 2 + 0 = 9.

So, the answer would be 9.