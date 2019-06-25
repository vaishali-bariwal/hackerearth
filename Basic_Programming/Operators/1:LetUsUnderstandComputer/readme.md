Mr. ABC was recently learning about computer division. Considering the basic model of the computer suppose we wish to divide a number X by D i.e X/D and obtain the result (Note that it is integer division i.e result of 7/2 will be 3).

Now the computer will give the divide overflow error if:

The number of bits in the binary representation(without appending any leading zeroes) of the resulting number(quotient) is greater than the number of bits in the binary representation of divisor(D) (Without appending any leading zeroes).

Now Mr. ABC is given an integer X for T testcases .He wishes to find number of such divisors D(1<=D<=X) for which divide overflow will not occur.

CONSTRAINTS :


1
≤
T
≤
10
6


1
≤
X
≤
10
12

INPUT:

The first line contains the integer T , the number of test cases.

In next T lines, each line contains an integer X.

OUTPUT: 

Print the required output for each testcase in new line. 

SAMPLE INPUT 
2
3
5
SAMPLE OUTPUT 
2
4
Explanation
For X=3 

    For D=1(1 bit) , result = 3/1=3 ( 2 bits)

    For D=2(2 bit) , result = 3/2=1 ( 1 bit) //ans++

    For D=3(2 bit) , result = 3/3=1 ( 1 bit) //ans++

Hence ans=2

 

For X=5

    For D=1(1 bit) , result = 5/1=5 ( 3 bits)

    For D=2(2 bit) , result = 5/2=2 (2 bit) //ans++

    For D=3(2 bit) , result = 5/3=1 (1 bit) //ans++

    For D=4(3 bit) , result = 5/4=1 (1 bit) //ans++

    For D=5(3 bit) , result = 5/5=1 (1 bit) //ans++

Hence ans=4

    

