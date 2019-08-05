You are given a binary tree rooted at 1. You have to find the mirror image of any node qi about node 1. If it doesn't exist then print -1.
Input:
First line of input is N and Q.
Next N-1 line consists of two integers and one character first of whose is parent node , second is child node and character "L" representing Left child and "R" representing right child.
Next Q lines represents qi.
Output:
For each qi print it mirror node if it exists else print -1. 
NOTE: 1 is mirror image of itself.
Constraints:
1 <= N <= 103
1<= Q <= 103

SAMPLE INPUT 
10 8
1 2 R
1 3 L
2 4 R
2 5 L
3 6 R
3 7 L
5 8 R
5 9 L
7 10 R
2
5
3
6
1
10
9
4
SAMPLE OUTPUT 
3
6
2
5
1
-1
-1
7