A binary operation ∗ on a set S is called associative if it satisfies the associative law: (x * y)*z = (y * z)*x for all 
x,y,z in S.

For the binary set S= {0,1} and a particular binary operator ∗ , you are given its truth table. Determine if the operation is associative.

|  a  |  b  | a * b |
| --- | --- | ----- |
|  0  |  0  |   c0  |
|  0  |  1  |   c1  |
|  1  |  0  |   c3  |
|  1  |  1  |   c4  |

```
Input format

First line: A single integer T denoting the number of test cases

For each test case: First line: Four space-separated integers c0, c1 , c2 and c3.

Output format

For each test case, print 'Yes' (without quotes) in a new line if the binary operation is associative in nature. Otherwise, print 'No' (without quotes).

Constraints
1≤T≤8
c0,c1,c2,c3∈ {0,1}

SAMPLE INPUT 
1
0 1 1 0

SAMPLE OUTPUT 
Yes

Explanation
The given operation is the binary xor. It can be easily proved that it is associative.
```
