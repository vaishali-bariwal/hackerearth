You like the sound of rain only if the sound ranges from 
l
 to 
r
 units. Every cloud makes 
s
 unit of sound. Determine the minimum and the maximum number of clouds that can produce the sound in the provided range.

Input format

First line: One integer 
T
 denoting the number of test cases
Next 
T
 lines: Three integers 
l
,
r
,
 and 
s
 denoting the provided range of the rain sound and the units of sound produced by each cloud
Output format

In 
T
 lines, print two space-separated integers that represent the minimum and the maximum number of the clouds that can produce the sound in the provided range.

Note: Print 
−
1
−
1
 if no answer is available.

Constraints


1
≤
T
≤
10
5
1
≤
l
≤
r
≤
10
9
1
≤
s
≤
10
9

SAMPLE INPUT 
3
5 10 3
7 12 4
50 60 1
SAMPLE OUTPUT 
2 3
2 3
50 60
Explanation
In the first test of the sample the answer is 
2
3
 because 
2
⋅
3
=
6
 which is in 
[
5
,
10
]
 and 
3
⋅
3
=
9
which is also in 
[
5
,
10
]
. Also 
4
⋅
3
=
12
 which exceeds Parmis's interval and is considered noise.

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit: