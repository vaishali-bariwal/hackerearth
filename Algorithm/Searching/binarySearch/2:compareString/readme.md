You have been given two strings, A and B (of length N each) and Q queries.
The strings contain only 0s and/or 1s.

For every query, you are given an index i. You have to update the value at index i to 1 in string B and check if B is lexicographically equal to or larger than A or not.
If yes, then print "
Y
E
S
" and if not, print "
N
O
" (without quotes).

Input format

First line contains two space-separated integers N and Q.
Next line contains the string A.
Next line contains the string B.
Next Q lines contains an integer i (1 - based indexing)
Output Format

For each query, print the desired output in a new line.

Input Constraints

1
≤
N
 , 
Q
≤
10
6


1
≤
i
≤
N

SAMPLE INPUT 
5 5
11111
00010
1
2
3
4
5
SAMPLE OUTPUT 
NO
NO
NO
NO
YES
Explanation
After 1st query: B = 10010. B < A. (NO)
After 2nd query: B = 11010. B < A. (NO)
After 3rd query: B = 11110. B < A. (NO)
After 4th query: B = 11110. B < A. (NO)
After 5th query: B = 11111. B = A. (YES)

