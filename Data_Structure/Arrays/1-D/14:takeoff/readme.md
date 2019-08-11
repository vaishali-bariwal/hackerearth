There are three planes 
A
, 
B
 and 
C
. Plane 
A
 will takeoff on every 
p
t
h
 day i.e. 
p
, 
2
p
, 
3
p
 and so on. Plane 
B
 will takeoff on every 
q
t
h
 day and plane 
C
 will takeoff on every 
r
t
h
 day. There is only one runway and the takeoff timing is same for each of the three planes on each day. Your task is to find out the maximum number of flights that will successfully takeoff in the period of 
N
 days.

Note: If there is collision between the flights no flight will take off on that day.

Input Format
The first line of the input contains a single integer 
T
, the number of test cases.
Then 
T
 lines follow each containing four space-separated integers 
N
, 
p
, 
q
 and 
r
 as denoted in the statement.

Output Format
For each test case print a single integer representing the maximum number of flights that will successfully takeoff in the period of 
N
 days.

Constraints
 
1
≤
T
≤
10


1
≤
N
,
p
,
q
,
r
≤
10
5
SAMPLE INPUT 
2
10 2 3 4
10 2 2 4
SAMPLE OUTPUT 
4
0
Explanation
Sample test case 
1
:
Note that on days 
2
 and 
10
 plane 
A
 can takeoff, on days 
3
 and 
9
 plane 
B
 can takeoff.

Sample test case 
2
:
Note that there is no day on which there is no collision.