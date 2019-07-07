A number is known as special bit number if its binary representation contains atleast two consecutive 1's or set bits. For example 
7
 with binary representation 
111
 is a special bit number. Similarly 
3
 
(
11
)
 is also a special bit number as it contains atleast two consecutive set bits or ones.

Now the problem is, You are given an Array of 
N
 integers and 
Q
 queries. Each query is defined by two integers 
L
, 
R
. You have to output the count of special bit numbers in the range 
L
 to 
R
.

Input

Contains integer 
N
, no of Array elements and 
Q
 - Total Number of Queries.

Next line contains 
N
 integers 
A
[
i
]
 defining Array elements.

Next 
Q
 lines contains Queries of the type 
1
≤
L
≤
R
≤
N

Output

Output  
Q
 lines containing answer for the ith Query.

Constraints


0
≤
A
[
i
]
≤
10
9


1
≤
N
≤
10
5


1
≤
Q
≤
10
5

SAMPLE INPUT 
5 3
3 5 1 12 7
1 3
2 3
1 5
SAMPLE OUTPUT 
1
0
3
Explanation
In Query 
1
 range is 
[
1
,
3
]
 and there is only one number with consecutive set bits is 
3
; So ans is 
1
.

In Query 
2
 range is 
[
2
,
3
]
 and there is no number is there with consecutive set bits. So ans is 
0
.

In Query 
3
 range is 
[
1
,
5
]
 and there are 3 numbers with consecutive bits 