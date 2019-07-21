Raman loves Mathematics a lot. One day his maths teacher gave him an interesting problem.

He was given an array 'A' consisting of 'n' integers, he was needed to find the maximum value of the following expression:

|Ai - Aj| + |i - j|
where, 0<= i,j <n and Ai, Aj are the Array elements.

Input:

First line of input contains an integer T denoting number of test cases.
Each test case contains two lines, first line contains integer n where n is the number of elements in array
Second line contains n space separated integers Ai.
Output:

Print the maximum value of the above give expression, for each test case separated in a new line.

Constraints:

1<=T<=100
1<=n<=105
0<=Ai<=105
Note: Use Fast I/O (scanf/printf or any other ways) to handle large test files.

SAMPLE INPUT 
2
3
1 1 1
4
1 2 3 1
SAMPLE OUTPUT 
2
4
Explanation
For the first sample case, if we choose i=0 and j=2; then we get the maximum value as 2.