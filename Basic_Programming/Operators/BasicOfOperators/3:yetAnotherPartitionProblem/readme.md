You are given an array of N integers. The task is to partition the array into an arbitrary number of groups (subarrays) such that bitwise AND of beauties of the groups is maximized.
The beauty of a group (subarray) is defined by the bitwise XOR of all the numbers belonging to that group (subarray).

Input format

First line of the input contains the number of test cases T.

Each test case has 2 lines. First line of the test case is the size of the array 
N. Second line has the array elements separated by space.

 

Output format

For each test case, output a single number, the maximum value achievable for the given array.

 

Constraints
1≤T≤50
1≤N≤10^5
0≤ai≤2^30

SAMPLE INPUT 
2
7
4 1 2 5 2 1 6
3
1 2 4
SAMPLE OUTPUT 
7
7
Explanation
1. [4 1 2 | 5 2 | 1 6] gives the maximum value of 7

2. [1 2 4] gives the maximum value of 7