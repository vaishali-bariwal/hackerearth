Given an array of positive and negative integers, denoting different types of parentheses. The positive numbers 
x
i
 denotes opening parentheses of type 
x
i
 and negative number 
−
x
i
 denotes closing parentheses of type 
x
i
.

Open parentheses must be closed by the same type of parentheses. Open parentheses must be closed in the correct order, i.e., never close an open pair before its inner pair is closed (if it has an inner pair). Thus, 
[
1
,
2
,
−
2
,
−
1
]
 is balanced, while 
[
1
,
2
,
−
1
,
−
2
]
 is not balanced.

You have to find out the length of the longest subarray that is balanced.

Input Format:
First line contains an input N 
(
1
≤
N
≤
2
∗
10
5
)
, denoting the number of parentheses. Second line contains N space separated integers. 
x
i
 
(
−
10
5
≤
x
i
≤
10
5
,
x
i
≠
0
)
 denoting the 
i
t
h
 parentheses of the array.

Output Format:
Print the length of the longest subarray that is balanced.

SAMPLE INPUT 
5
1 -1 2 3 -2
SAMPLE OUTPUT 
2
Explanation
The longest subarray that is balanced is 
(
1
,
−
1
)
. 
(
2
,
3
,
−
2
)
 is not balanced as 3 is not balanced.