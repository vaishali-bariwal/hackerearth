You are given a number 
N
 represented as a binary representation of 
X
=
16
 bits. You are also given a number 
m
 and a character 
c
 
(
L
 
o
r
 
R
)
.

Determine a number 
M
 that is generated after cyclically shifting the binary representation of 
N
 by 
m
 positions either left if 
c
=
L
 or right is 
c
=
R
.

Input format 

The first line contains an integer 
T
 representing the number of queries.
The next 
T
 lines contain 
N
 
m
 
c
 as mentioned in the problem statement.
Output format

Print 
T
 integers in a separate line representing the answer to each query.

Constraints

1
≤
T
≤
1
e
4
1
≤
N
≤
65535
1
≤
m
≤
15
 
 

SAMPLE INPUT 
2
7881 5 L
7881 3 R
SAMPLE OUTPUT 
55587
9177
Explanation
For first case :  N in binary is 0001 1110 1100 1001 and shifting it left by 5 position, it becomes 1101 1001 0010 0011 which in decimal system is 55587

For second case : N in binary is 0001 1110 1100 1001 and shifted 3 position to right it becomes 0010 0011 1101 1001 which in decimal system is 9177