You are given an array of numbers Ai which contains positive as well as negative numbers . The cost of the array can be defined as C(X).C(x)=|A1+T1|+|A2+T2|+........|An+Tn|, where T is the transfer array which contains N zeros initially.

You need to minimize this cost . You can transfer value from one array element to another if and only if the distance between them is at most K.

Also, transfer value can't be transferred further.

Say array contains 3,−1,−2and K=1 .if we transfer 3 from 1st element to 2nd, the array becomes

Original Value  :  3,−1,−2

Transferred value  : −3,3,0

C(x)=
|3−3|+|−1+3|+........|−2+0|=4
 which is minimum in this case

Note :

Only positive value can be transferred

It is not necessary to transfer whole value i.e partial transfer is also acceptable. This means that if you have 
A
[
i
]
=
5
 then you can distribute the value 5 across many other array elements provided that they finally sum to a number less than equal to 5. For example 5 can be transferred in chunks of smaller values say 2 , 3 but their sum should not exceed 5.

Input:

First line contains N and K separated by space

Second line denotes an array of size N

Output

Minimum value of 
C(X)


SAMPLE INPUT 
3 2
3 -1 -2
SAMPLE OUTPUT 
0

