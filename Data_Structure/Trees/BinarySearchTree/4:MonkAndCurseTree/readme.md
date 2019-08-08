Monk has an array A having N distinct integers and a Binary Search Tree which is initially empty. He inserts all the elements of the array from index 1 to N in the BST in the order given in the array. But wait! The tree so formed turns out to be cursed. Monk is having some weird experiences since he made that tree.

So, now to stop all that, Monk has two options, to destroy the BST or to pray to God and ask for a solution. Now since Monk has to use this BST in a Code Monk Challenge, he cannot destroy it. So he prays to God.

God answer his prayers and sends an angel named Micro. Now, Micro asks Monk to find something. He tells him two values, X and Y, present in the BST and ask him to find the maximum value that lie in the path between node having value X and node having value Y. (including X and Y ).

Now since, Monk is very afraid of that tree he asks for your help.

Input:
First line consists of a single integer denoting N.
Second line consists of N space separated integers denoting the array A.
Third line consists of two space separated integers denoting X and Y.

Output:
Print the maximum value that lie in the path from node having value X and node having value Y in a new line.

Constraints:

1
≤
N
≤
10
5


1
≤
A
[
i
]
≤
10
9
 
It is ensured that values X and Y are present in the array.

SAMPLE INPUT 
5
4 7 8 6 3
3 7

SAMPLE OUTPUT 
7
Explanation
Binary Search Tree for the given array is given below

![image](https://he-s3.s3.amazonaws.com/media/uploads/3ccfb6b.png)

Path between node having value 3 and node having value 7 is 3 -> 4 -> 7. Maximum value that lies on this path is 7.