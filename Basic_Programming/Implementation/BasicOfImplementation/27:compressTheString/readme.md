Given a string 
S
 of lowercase english alphabets of length 
N
. You need to compress the string with the following rules:

1
. Convert the first letter to the uppercase

2
. Convert the substring consisting of all the consonants to the length of this substring (e.g. abcde to a3e)

3
. Remove the consecutive duplicate vowels (e.g. aaaeiia to aeia)

Note: The first letter will not follow the rules 2 and 3.

Input Format
The first line of the input contains the number 
T
, the total number of the test cases.
The first line of each test case contains the number 
N
, the length of the string 
S
.
The second line of each test case contains the string 
S
.

Output Format
For each test case print the compressed string according to the above-mentioned rules.

Constraints
 
1
≤
T
≤
10
3


1
≤
N
≤
10
5

Sum of 
N
 over all test cases doesn't exceed 
10
6
SAMPLE INPUT 
2
10
aaabcdefee
15
pqrsaeiiiouixyz
SAMPLE OUTPUT 
Aa3e1e
P3aeioui3
Explanation
Sample test case 
1
:
The first character has to be converted to the uppercase regardless of whether it is a vowel or a consonant.

[ a | aa | bcd | e | f | ee ] to [ A | a | 3 | e | 1 | e 