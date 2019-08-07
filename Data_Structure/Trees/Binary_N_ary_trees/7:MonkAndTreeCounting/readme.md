Given a Binary tree T consisting of N nodes rooted at node 1 and a number K. each node has a number written on it, where the number written on the 
i
t
h
 node is 
A
[
i
]
.

Now, Monk needs to find the number of unordered triplets 
(
i
,
j
,
k
)
, such that node i is an ancestor of node j as well as node k, 
j
≠
k
, and 
A
[
i
]
+
A
[
j
]
+
A
[
k
]
≥
K
. 
A node x is considered an ancestor of another node y if x is parent of y or x is an ancestor of parent of y.

Help Monk for the same.

Input Format :

The first line contains 2 space separated integers N and K. The next line contains N space separated integers, where the 
i
t
h
 integer denotes 
A
[
i
]
.

The next line contains 
N
−
1
 space separated integers, where the 
i
t
h
 integer represents the parent of node 
i
+
1
.

Output Format :

Print the required answer on a single line.

Constraints :


1
≤
N
≤
500


0
≤
A
[
i
]
,
K
≤
10
9


1
≤
p
a
r
e
n
t
[
i
]
<
i
, where 
2
≤
i
≤
N

Note :

It is guaranteed that the given input forms a valid binary tree.

SAMPLE INPUT 
5 6
1 2 3 4 5
1 2 2 1
SAMPLE OUTPUT 
7
Explanation
Image of the tree is given below

![ img ](https://he-s3.s3.amazonaws.com/media/uploads/cf3b5b3.png)

The triplets forming part of the answer are :


(
1
,
2
,
3
)


(
1
,
2
,
4
)


(
1
,
2
,
5
)


(
1
,
3
,
4
)


(
1
,
3
,
5
)
.


(
1
,
4
,
5
)
.

