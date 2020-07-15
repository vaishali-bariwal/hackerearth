Pikachu loves battling with other Pokemon. This time he has a team of 
N
 Meowstic to fight, 
i
t
h
 of which has strength 
a
i
. He wants to fight with all of them 
K
 times. Team Meowstic came to know about this and now they have devised a strategy to battle against the mighty Pikachu.

All the 
N
 Meowstic stand in a straight line numbered from 
1
 to 
N
. Before every round of battle, they simultaneously use a move, called Helping Hand. It changes the attacking power of Team Meowstic as follows:

The attacking power of first Meowstic remains 
a
1
.
The attacking power of remaining Meowstic changes as 
a
i
=
a
i
|
a
i
−
1
 where 
2
≤
i
≤
N
 and 
A
|
B
 represents the bitwise OR of 
A
 and 
B
 
For example, if the current attacking powers are 
[
2
,
1
,
4
,
6
,
3
]
, after using the Helping Hand, the powers change to 
[
2
,
1
|
2
,
4
|
1
,
6
|
4
,
3
|
6
]
, or 
[
2
,
3
,
5
,
6
,
7
]
.

Help Pikachu by finding the attacking powers of all Meowstic when he fights each of them for the last time, that is, for the 
K
t
h
 round.

Note that, the influence of Helping Hand remains forever, and attacking powers DO NOT revert back after any round.

Constraints:


1
≤
N
≤
10
5

0
≤
K
≤
10
9

0
≤
a
i
<
2
30
Input format:

First line contains two space separated integers, 
N
 and 
K
Second line contains  
N
 space separated integers, the 
i
t
h
 of which is 
a
i
 
Output format:

Output a single line containing 
N
 integers, the 
i
t
h
 of which is 
a
i
 after the last round 
SAMPLE INPUT 
5 3
1 2 3 4 5
SAMPLE OUTPUT 
1 3 3 7 7
Explanation
Battle 1:

 
a
1
=
1
,
a
2
=
1
|
2
=
3
,
a
3
=
2
|
3
=
3
,
a
4
=
3
|
4
=
7
,
a
5
=
4
|
5
=
5

Battle 2:


a
1
=
1
,
a
2
=
1
|
3
=
3
,
a
3
=
3
|
3
=
3
,
a
4
=
3
|
7
=
7
,
a
5
=
7
|
5
=
7

Battle 3:


a
1
=
1
,
a
2
=
1
|
3
=
3
,
a
3
=
3
|
3
=
3
,
a
4
=
3
|
7
=
7
,
a
5
=
7
|
7
=
7
 

T