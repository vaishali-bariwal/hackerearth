We have 
m
 completely wet clothes out under sunshine waiting to become dry. we are now at second 
t
1
 and it's raining. It's going to rain again on seconds 
t
2
…
t
n
 and after each rain clothes will be completely wet again. Cloth number 
i
 needs 
a
i
 seconds to become dry. We can go out and collect all dry clothes at any moment but can't do this more than 
g
 times. What is the maximum number of clothes we can collect until second 
t
n
? Note that the duration of each rain is almost zero, so we can ignore it. Also collecting clothes does not take any time from us.

Input format

First line of input contains three integers 
n
,
m
,
g
 (
2
≤
n
≤
100
, 
1
≤
m
,
g
≤
100
) respectively. In the second line will be 
n
 increasing numbers denoting 
t
1
…
t
n
 (
0
≤
t
1
<
.
.
.
<
t
n
≤
10
4
). In the Last line will have 
m
 numbers denoting 
a
1
…
a
m
 (
1
≤
a
i
≤
10000
).

Output format

In a single line print maxmimum number of clothes we can collect.

SAMPLE INPUT 
3 3 2
3 5 8
4 1 3
SAMPLE OUTPUT 
2
Explanation
In the sample, first we go outside at time 5(exactly before rain) and take second piece of clothes. Then for the second time, at second 8, we go and take third piece.