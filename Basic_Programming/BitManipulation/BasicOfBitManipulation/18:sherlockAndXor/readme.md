You are given an array A1,A2...AN. You have to tell how many pairs (i, j) exist such that 1 ≤ i < j ≤ N and Ai XOR Aj is odd.

Input and Output 
First line T, the number of testcases. Each testcase: first line N, followed by N integers in next line. For each testcase, print the required answer in one line.

Constraints 
1 ≤ T ≤ 10 
1 ≤ N ≤ 105 
0 ≤ Ai ≤ 109

SAMPLE INPUT 
2
3
1 2 3
4
1 2 3 4
SAMPLE OUTPUT 
2
4
Explanation
For first testcase: 1 XOR 2 is 3 and 2 XOR 3 is 1. So, 2 valid pairs. For second testcase: 1 XOR 2 is 3 and 2 XOR 3 is 1 and 1 XOR 4 is 5 and 3 XOR 4 is 7. So, 4 valid pairs.