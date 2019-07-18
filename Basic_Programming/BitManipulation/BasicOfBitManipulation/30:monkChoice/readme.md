Monk loves cakes! He visits the Binary Bakery to buy some of his favorite cheesecakes. 
The owner of the bakery, Bob, is a clever man. He does not want Monk to finish all his cheesecakes. Hence, he plays a game.
The Monk is given N numbers and has to select K of these numbers. For each number that Monk chooses, he will get as many cheesecakes as the number of 1's in the Binary representation of the number i.e. the number of bits that are set.
Help Monk find the maximum number of cakes that he can have.

Input:
The first line of input contains T. T test cases follow.
First line of each test cases contains 2 space-separated integers N and K.
The next line contains N space-separated integers.

Output:
For each test cases, print the answer in a new line.

Constraints:
1 ≤ T ≤ 10
1 ≤ N ≤ 103
0 ≤ K ≤ N
0 ≤ Numbers ≤ 105

SAMPLE INPUT 
1
4 2
6 1 2 0
SAMPLE OUTPUT 
3
Explanation
He chooses numbers 6 (110) and 1 (001) with 2 and 1 set bits respectively.