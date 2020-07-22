There are three integers k,m,n. You have to convert the number k to m by performing the given operations:

Multiply k by n
 Decrease k by 2.
 Decrease k by 1.
You have to perform the above operations to convert the integer from k to m and find the minimum steps.

 

Note: You can perform the operations in any order.

 

Input : -

First-line contains the number of test cases T.

The next T line contains three space-separated integers k, m, and n.

 

Output : -

Print minimum no. of steps as output in a new line for each test case.

 

Constraints:-

1 <= T <= 104 

0 <= k,m,n <= 109 

 

SAMPLE INPUT 
2
3 10 2
11 6 2
SAMPLE OUTPUT 
3
3
Explanation
For test case 1: -

1) First multple 3 with 2 then

2) Subtract 1 from 6 to get 5

3) Multiple 5 with 2  to get 10.

So, 3 steps.

 

For test case 2: -

1) Subtact 2 from 11 , 2 times

2) Subtract 1 from 7.

So, 3 steps.

s