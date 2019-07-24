Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.

More formally,

G[i] for an element A[i] is an element A[j] such that 
    j is maximum possible AND 
    j < i AND
    A[j] < A[i]
Elements for which no smaller element exist, consider next smaller element as -1.

Input Format

First line contains an integer N denoting the number of elements in the array (not necessarily distinct).

Second line contains N space separated integers denoting the elements of the array.

Output Format

Print N space separated integers denoting the array G.

Constraints

 
1
≤
N
≤
10
5


0
≤
A
[
i
]
≤
10
6

SAMPLE INPUT 
8
39 27 11 4 24 32 32 1
SAMPLE OUTPUT 
-1 -1 -1 -1 4 24 24 -1