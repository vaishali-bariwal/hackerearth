Given a chess board having 
N
×
N
 cells, you need to place N queens on the board in such a way that no queen attacks any other queen.

Input:
The only line of input consists of a single integer denoting N.

Output:
If it is possible to place all the N queens in such a way that no queen attacks another queen, then print "YES" (without quotes) in first line, then print N lines having N integers. The integer in 
i
t
h
 line and 
j
t
h
 column will denote the cell 
(
i
,
j
)
 of the board and should be 1 if a queen is placed at 
(
i
,
j
)
 otherwise 0. If there are more than way of placing queens print any of them.

If it is not possible to place all N queens in the desired way, then print "NO" (without quotes).

Constraints:

1
≤
N
≤
10
.

SAMPLE INPUT 
4
SAMPLE OUTPUT 
YES
0 1 0 0 
0 0 0 1 
1 0 0 0 
0 0 1 0
