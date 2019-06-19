Pradyumn found a game named Stringle. In this game, Pradyumn was given a Bit String. According to game rules, you have to keep rotating the string in clockwise direction until the string vanishes. Are you wondering, how the string will vanish if the string will keep rotating.
Game shouted "Fellas! There is one more rule, if number of rotations is equal to current string length. Middle character of the string is deleted. If the length of current string is even, you are allowed to delete any of 
(
n
/
2
)
t
h
 or 
(
n
/
2
+
1
)
t
h
 letter. Rotations counting again starts from 1." Now, Stringle asks "After how many rotations will the input string vanish". String follows 1 - based indexing.
INPUT CONSTRAINTS

1
≤
T
≤
10


1
≤
l
e
n
g
t
h
(
B
i
t
S
t
r
i
n
g
)
≤
10
5


INPUT FORMAT
One line having one integer T, where T is number of test cases.
T lines each having Bit String(String consist of only 0s and 1s).

OUTPUT FORMAT
Number of rotations required to vanish the Bit String.

SAMPLE INPUT 
1
1
SAMPLE OUTPUT 
1
Explanation
Rotating Bit String first time, changes it to 1.
Now, middle character of unit length string is first character of the string.
Thus, after deleting it, string vanishes.
Number of rotations required is 1.