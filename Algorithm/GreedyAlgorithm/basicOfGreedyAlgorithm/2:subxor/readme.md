You are provided an array 
A
 of 
n
 integers. You are required to partition the array into the minimum number of subarrays such that the 
X
O
R
 of any non-empty subset of the subarrays is not equal to zero. If no such partition exists, then print 
−
1
. Otherwise, print 1.

Note:

A subarray is a non-empty contiguous subsequence of an array.
The 
X
O
R
 of a set of subarrays is defined as the sum of determined 
X
O
R
s
 of the numbers in all the subarrays when accumulated.
Input format

The first line consists of an integer 
n
 that is followed by 
n
 space-separated integers.

Output format

Print the answer in a single line.

Constraints


1
≤
n
≤
5
∗
10
5


0
≤
A
[
i
]
≤
10
9

SAMPLE INPUT 
2
2 2
SAMPLE OUTPUT 
-1
Explanation
The possible partitions of the array are: [2],[2] but the xor of both the subarrays is 0 and [2,2] where the xor of this subarray itself is 0. Hence the answer is -1.