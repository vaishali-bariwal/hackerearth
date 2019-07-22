You are given 
2
 arrays 
A
 and 
B
, each of the size 
N
. Each element of these arrays is either a positive integer or 
−
1
. The total number of 
−
1
′
s
 that can appear over these 
2
 arrays are 
≥
1
 and 
≤
2
.

Now, you need to find the number of ways in which we can replace each 
−
1
 with a non-negative integer, such that the sum of both of these arrays is equal.

Input format

First line: An integer 
N
Second line: 
N
 space-separated integers, where the of these denotes 
A
[
i
]
Third line: 
N
 space-separated integers, where the 
i
t
h
 of these denotes 
B
[
i
]
Output format

If there exists a finite number 
X
, then print it. If the answer is not a finite integer, then print 'Infinite'.

Constraints


1
≤
N
≤
10
5


−
1
≤
A
[
i
]
,
B
[
i
]
≤
10
9

The 
−
1
′
s
 may spread out among both arrays, and their quantity is between 
1
 and 
2
 (both inclusive)

Sample Input 2

4
1 2 -1 4
3 3 -1 1
Sample Output 2

Infinite
SAMPLE INPUT 
4
1 2 -1 4
3 3 3 1
SAMPLE OUTPUT 
1
Explanation
We can replace the only 
−
1
 by 
3
, so that the sum of both of these arrays become 
10
.

T