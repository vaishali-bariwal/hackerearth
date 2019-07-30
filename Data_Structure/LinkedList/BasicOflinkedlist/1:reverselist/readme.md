You are given a linked list that contains 
N
 integers. You have performed the following reverse operation on the list:

Select all the subparts of the list that contain only even integers. For example, if the list is 
{
1
,
2
,
8
,
9
,
12
,
16
}
, then the selected subparts will be 
{
2
,
8
}
, 
{
12
,
16
}
.
Reverse the selected subpart such as 
{
8
,
2
}
 and 
{
16
,
12
}
.
Now, you are required to retrieve the original list.

Note: You should use the following definition of the linked list for this problem:

class Node {
    Object data;
    Node next;
}
Input format

First line: 
N
 
Next line: 
N
 space-separated integers that denote elements of the reverse list
Output format

Print the 
N
 elements of the original list.

Constraints


1
≤
N
≤
10
3


1
≤
A
i
≤
10
9

SAMPLE INPUT 
9
2 18 24 3 5 7 9 6 12
SAMPLE OUTPUT 
24 18 2 3 5 7 9 12 6
Explanation
In the sample, the original list is 
{
24
,
18
,
2
,
3
,
5
,
7
,
9
,
12
,
6
}
 which when reversed according to the operations will result in the list given in the sample input.