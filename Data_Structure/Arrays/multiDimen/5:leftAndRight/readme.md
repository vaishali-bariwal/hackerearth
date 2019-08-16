A country X consists of N cities numbered 0 through 
N
−
1
. The map of this country can be represented as a cycle — for each valid i, city i has exactly two neighboring cities 
(
i
+
1
)
%
N
 and 
(
i
−
1
+
N
)
%
N
.

The cities in the country are broadly categorized into different types. For each valid i, the type of city i is denoted by 
A
i
.

A person called Suarez wants to travel between some pairs of the cities. You are given Q queries. In each query, Suarez wants to travel from city number Y to a city of type Z. Also, he wants to travel only in a given direction along the cycle.

The direction is represented by a letter — L or R. If it's L, Suarez may only move from city i to city 
(
i
−
1
+
N
)
%
N
 for each valid i. If it's R, he may only move from city i to city 
(
i
+
1
)
%
N
.

You need to find the minimum number of steps Suarez needs to take to reach a city of type Z if he starts moving from city Y in the given direction (he can take zero steps). In one step, Suarez can move from his current city to a neighboring city.

If Suarez can never reach a city of type Z for a given query, print 1 instead.

Constraints


1
≤
N
≤
3
,
000


1
≤
Q
≤
500
,
000


0
≤
Y
<
N


1
≤
A
i
,
Z
≤
200
,
000

Input format

The first line of the input contains two space-separated integers N and Q. The next line contains N space-separated integers, where the i-th of these integers represents 
A
i
.

Each of the following Q lines describes a query in the format 
Y
 
Z
 
D
, where Y is an integer denoting the number of the starting city, Z is an integer denoting the type of a target city and D is a letter ('L' or 'R') denoting the direction along the cycle.

Output format

For each query, print a single line containing one integer — the answer to the query.

SAMPLE INPUT 
3 4
1 2 3
0 1 L
1 3 L
2 1 R
1 5 L
SAMPLE OUTPUT 
0
2
1
-1
Explanation
For the first query, Suarez is already standing in a city of the required type, hence 0 steps taken.

For the second query, Suarez will take the path 1 -> 0 -> 2, hence 2 steps taken.

For the third query, Suarez will take the path 2 -> 0, hence 1 step taken.

For the fourth query, there is no city of type 5, so the answer is 1.