You are given an array of 
N
  numbers. Count the number of subarrays having the absolute value of sum strictly greater than 
K
   i.e 
|
s
u
m
|
>
K
 .

 

Input Format

The first line contains a positive integer 
T
 , the number of test cases. 
Each test case contains a single integer 
N
  which denotes the number of elements in the array.
The next line contains  
N
  space separated integers 
A
1
,
A
2
,
A
3
,
.
.
.
.
,
A
N
 denoting the elements in the array.
Output Format 

For each test case print the answer in a new line.

Constraints


1
<=
T
<=
10
3

1
<=
N
<=
2
∗
10
5

1
<=
K
<=
10
18

|
A
i
|
<=
10
9
The sum of 
N
 over all test cases does not exceed 
2
∗
10
5
 

SAMPLE INPUT 
2
3 2
2 -2 3
5 0
2 -3 0 3 2
SAMPLE OUTPUT 
2
13
Explanation
1. In the first Test Case, the subarrays with sum greater than 2 are

{3}  Sum=3

{2,-2,3} Sum= 2 -2 + 3 = 3

2. In the 2nd test Case, there are total 15 subarrays.

All except {0}  {-3,0,3} have sum greater than 0