Tuntun mausi challenged Bheem and his team to solve a problem. Raju, Chutki and Bheem are trying to solve this problem but are unable to do so. As you are a good friend of Raju, he asks for your help.

Given an array, For each element find the value of nearest element to the right which is having frequency greater than as that of current element. If there does not exist an answer for a position, then print '-1'

Please help Raju and his team to solve this problem to get the Laddus.

Input
First line contains T denoting the no of test cases.
First line of each test case contains N denoting the no of elements in array.
Second line of each test case contains N integers (A1..An) denoting the given array.

Output For each test case print space separated N numbers denoting the answer corresponding answer.

Constraints

20 points: T<=100 1<=N<=10^2 1<=Ai<=10^2

80 points: T<=100 1<=N<=10^5 1<=Ai<=10^5

Problem Setter
Aadersh Agarwal

Time Limit
2.5 seconds

SAMPLE INPUT 
3
10
1 3 7 2 5 1 4 2 1 5
5
1 1 1 1 1
6
1 1 2 2 2 3
SAMPLE OUTPUT 
-1 2 2 1 1 -1 2 1 -1 -1 
-1 -1 -1 -1 -1 
2 2 -1 -1 -1 -1
Explanation
Sample 1:
The given array is 
1 3 7 2 5 1 4 2 1 5 
3 1 1 2 2 3 1 2 3 2 denotes the frequency of ith element in array.
Index 1: there is no element to the right which has frequency greater than that of 1st element (i.e frequency >3) 
Index 2: It has a frequency of 1. the nearest index to the right which has frequency greater than 1 is at index 4 i.e of element 2.

For last element the answer will always be -1