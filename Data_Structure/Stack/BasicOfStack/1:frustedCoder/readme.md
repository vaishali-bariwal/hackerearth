[!img train img](https://he-s3.s3.amazonaws.com/media/uploads/5cfe15bd-0356-4a9f-bdfc-347a36d98bb8.png)

AND THAT TOO IN C !!!

CAN IT GET ANY WORSE :P

There are N frustrated coders standing in a circle with a gun in their hands. Each coder has a skill value S[ i ] and he can only kill those coders that have strictly less skill than him. One more thing, all the guns have only 1 bullet. This roulette can take place in any random order. Fortunately, you have the time stone (haaan wo harre wala) and you can see all possible outcomes of this scenario. Find the outcome where the total sum of the remaining coder's skill is minimum. Print this sum.

INPUT

The first line contains N the no. of coders

The next line contains N  elements where the ith element is theS[ i ] of ith coder.

OUTPUT

Print a single line containing the minimum sum

CONSTRAINTS

1<= N <= 1000000

1<=S[ i ]<=1000

SAMPLE INPUT 
6
1 7 2 2 4 4
SAMPLE OUTPUT 
11
Explanation
the coder of skill 2 kills coder skill 1

Both coders of skill 4 kill both coders of skill 2

the coder of skill 7 kills 1 coder of skill 4

remaining skills = 7+4 = 11