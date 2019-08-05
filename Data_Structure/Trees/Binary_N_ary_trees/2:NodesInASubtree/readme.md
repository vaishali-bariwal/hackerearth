You are given a rooted tree that contains 
N
 nodes. Each node contains a lowercase alphabet.

You are required to answer 
Q
 queries of type 
u
,
c
, where 
u
 is an integer and 
c
 is a lowercase alphabet. The count of nodes in the subtree of the node 
u
 containing 
c
 is considered as the answer of all the queries. 

Input format

First line: Two space-separated integers 
N
 
a
n
d
 
Q
 respectively
Second line: A string 
s
 of length 
N
 (where the 
i
t
h
 character of 
s
 represents the character stored in node 
i
)
Next 
N
−
1
 line: Two space-separated integers 
u
 and 
v
 denoting an edge between node 
u
 and node 
v
Next 
Q
 lines: An integer 
u
 and a space-separated character 
c
 
Output format
For each query, print the output in a new line. 

Constraints


1
≤
N
,
Q
≤
10
5
1
≤
u
,
v
≤
N


c
 is a lowercase alphabet

s
i
 is a lowercase alphabet for all 
1
≤
i
≤
N

1
 is the root node
Note: It is guaranteed that the input generates a valid tree.

SAMPLE INPUT 
3 1
aba
1 2
1 3
1 a
SAMPLE OUTPUT 
2
Explanation
Tree given in the sample input will look like that.

[!img tree image](https://he-s3.s3.amazonaws.com/media/uploads/6dc54166-4299-4ae9-b4b6-83256be38083.png)

Number of nodes in the subtree of node 1 having 'a' stored in it is 2. 