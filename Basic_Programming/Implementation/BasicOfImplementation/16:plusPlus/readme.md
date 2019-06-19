You are given a two dimensional grid A of size n×m(n rows and m columns). Your task is to select two non overlapping Plus signs from the grid and do multiplication with corresponding elements and find out summation. What is the maximum summation.

Note: The Plus sign will be formed by 5 cells which have coordinates of form (x,y), (x−1,y), (x+1,y), 
(x,y−1), (x,y+1). The center of the Plus sign cannot lie on boundary of the grid.Over lapping Plus signs would have atleast one cell in common. Please, see the explanation below for exact figure. 

INPUT

First line contains two space separated integers n and m, denoting size of array A.
Next n lines contains m space separated integers.

OUTPUT

Print the required maximum value.
Constraints:

6≤n,m≤50
0≤A(i,j)≤9

SAMPLE INPUT 
6 6
4 0 8 4 3 0
7 8 3 4 7 4
9 2 6 0 5 8
2 0 6 3 9 7
1 5 0 5 6 3
5 0 0 0 4 1

SAMPLE OUTPUT 
166

Explanation
Maximum value can be obtained if we select two Plus signs centered at (2,3) and (5,5), which are represented by yellow and green color in following diagram. Note, these plus signs are non overlapping because every no cell is shared by different color's plus sign.

[! grid representation](https://he-s3.s3.amazonaws.com/media/uploads/cb6232e3-f6de-44a1-ad72-29090ec6cd9f.png)

Summation: 
8⋅9+8⋅5+3⋅6+4⋅3+6⋅4 = 166.