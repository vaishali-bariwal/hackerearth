Alice and Bob saw a challenging track which consists of 
N
 hurdles of variable heights 
H
i
. Now, Bob challenges Alice to complete this track with a given amount of jump power 
P
.

The rules for completing the challenge are as follows:


1
. Each time Alice jumps a hurdle, jump power 
P
 of Alice reduces by the height of the hurdle.


2
. Every even minute all the remaining hurdles having even heights will decay and their heights reduce by 
1
 and every odd minute all the remaining hurdles having odd heights will decay and their heights reduce by 
1
.

Initially, time 
T
=
0
 minute. It takes 
1
 minute for Alice to reach to the next hurdle and the time taken to jump a hurdle can be considered to be negligible. Alice has to complete the challenge starting from the first hurdle to the last hurdle, left to right, sequentially.

If 
P
<
0
 at any moment, Alice cannot move further. Find out if Alice can complete the challenge?

Input Format

The first line of the input contains 
T
, the total number of test cases.

The second line of the input contains two space-separated integers 
N
 and 
P
, the total number of hurdles and the total jump power value.

The next line contains 
N
 space-separated integers 
H
i
, the heights of each hurdle.

Output Format

For each test case, if it is possible for Alice to complete the challenge, print 
Y
e
s
 and the remaining value of jump power 
P
 or 
N
o
 if it is not possible.

Constraints


1
≤
T
≤
10


1
≤
N
≤
10
5


1
≤
P
≤
10
15


1
≤
H
i
≤
10
9

SAMPLE INPUT 
2
6 21
8 6 1 7 6 5
3 6
5 2 7
SAMPLE OUTPUT 
Yes 0
No
Explanation
Sample test case 
1


T
=
0
,
[
8
,
6
,
1
,
7
,
6
,
5
]
,
21
−
8
=
13
 


T
=
1
,
[
5
,
1
,
7
,
5
,
5
]
,
13
−
5
=
8


T
=
2
,
[
0
,
6
,
4
,
4
]
,
8
−
0
=
8
 (If hurdle's height becomes 
≤
0
, skip it)


T
=
3
,
[
5
,
3
,
3
]
,
8
−
5
=
3


T
=
4
,
[
2
,
2
]
,
3
−
2
=
1


T
=
5
,
[
1
]
,
1
−
1
=
0

Sample test case 
2


T
=
0
,
[
5
,
2
,
7
]
,
6
−
5
=
1


T
=
1
,
[
1
,
7
]
,
1
−
1
=
0


T
=
2
,
[
6
]
,
0
−
6
 (Not possible)