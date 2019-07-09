You are given with an array 
A
 of size 
N
.An element 
A
i
 is said to be charged if its value(
A
i
) is greater than or equal to 
K
i
. 
K
i
 is the total number of subsets of array 
A
, that consist of element 
A
i
. 
Total charge value of the array is defined as summation of all charged elements present in the array mod 
10
9
+
7
.
Your task is to output the total charge value of the given array 
A
.

INPUT FORMAT:

The first line of input contains number of test cases 
T
.
The first line of each test case consists of 
N
, the size of the array.
Next line contains 
N
 space-separated integers corresponding to each element 
A
i
.

OUTPUT FORMAT:

For each test case, output a single number corresponding to total charge value of the given array.

CONSTRAINTS:

1
≤
T
≤
100
1
≤
N
≤
10
5
0
≤
A
i
≤
10
18

SAMPLE INPUT 
2
3
3 4 5
2
1 6
SAMPLE OUTPUT 
9
6
Explanation

CASE 1:
Possible subsets are: {3}, {4}, {5}, {3,4}, {3,5}, {4,5}, {3,4,5}, {}.
Element 3 is present in 4 subsets. As 3<4, it is not charged.
Element 4 is present in 4 subsets. As 4>=4, it is charged.
Element 5 is present in 4 subsets. As 5>=4, it is charged.
Total charge=4+5=9

CASE 2:
Possible subsets are: {1}, {6}, {1,6}, {}.
Element 1 is present in 2 subsets. As 1<2, it is not charged.
Element 6 is present in 2 subsets. As 6>=2, it is charged.
Total charge=6