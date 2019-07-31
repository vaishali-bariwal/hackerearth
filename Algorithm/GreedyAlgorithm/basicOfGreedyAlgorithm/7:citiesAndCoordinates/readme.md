There are N cities in Imaginary Land. The President of Imaginary Land uses the Cartesian coordinates. Each city is located at some point with integer co-ordinates. The President is very careful and concerned about the well-being of the citizens of his country.

For that reason, he wants to create a boundary and cover all the cities inside that boundary. The boundary should in the shape of a square and should be parallel to the coordinate axes. Find the minimum area enclosed by the boundary such that all the cities are on or inside the boundary.

Input:

The first line of the input contains T, denoting the number of test cases.

Each test case consists of a single positive integer N denoting the number of cities in Imaginary Land.

Each of the next N lines contains two integers 
x
i
 and 
y
i
 denoting the coordinates of the 
i
t
h
 city.

Output:

For each test-case, output a single non-negative integer denoting the minimum area of the square boundary that encloses all the cities inside or on its boundary.

Constraints:


1
≤
T
≤
5

1
≤
N
≤
10
5

−
10
9
≤
x
i
,
y
i
≤
10
9
SAMPLE INPUT 
2
4
-1 -1
1 1
1 -1
-1 1
3
0 0
1 1
2 2
SAMPLE OUTPUT 
4
4
Explanation
In the first test case, all the points are on the boundary of a square of side 2. Hence 
a
n
s
w
e
r
=
4
.

In the second test case, the smallest square can be drawn is of side 2 having center at 
(
0
,
0
)
.