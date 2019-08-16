Shyam Lal, a wealthy landlord from the state of Rajasthan, being an old fellow and tired of doing hard work, decided to sell all his farmland and to live rest of his life with that money. No other farmer is rich enough to buy all his land so he decided to partition the land into rectangular plots of different sizes with different cost per unit area. So, he sold these plots to the farmers but made a mistake. Being illiterate, he made partitions that could be overlapping. When the farmers came to know about it, they ran to him for compensation of extra money they paid to him. So, he decided to return all the money to the farmers of that land which was overlapping with other farmer's land to settle down the conflict. All the portion of conflicted land will be taken back by the landlord. 

To decide the total compensation, he has to calculate the total amount of money to return back to farmers with the same cost they had purchased from him. Suppose, Shyam Lal has a total land area of 1000 x 1000 equal square blocks where each block is equivalent to a unit square area which can be represented on the co-ordinate axis. Now find the total amount of money, he has to return to the farmers. Help Shyam Lal to accomplish this task. 

Input Format:
The first line of the input contains an integer N, denoting the total number of land pieces he had distributed. Next N line contains the 5 space separated integers (X1, Y1), (X2, Y2) to represent a rectangular piece of land, and cost per unit area C.
(X1, Y1) and (X2, Y2) are the locations of first and last square block on the diagonal of the rectangular region.

Output Format:
Print the total amount he has to return to farmers to solve the conflict.

Constraints:
1 ≤ N ≤ 100
1 ≤ X1 ≤ X2 ≤ 1000
1 ≤ Y1 ≤ Y2 ≤ 1000
1 ≤ C ≤ 1000

SAMPLE INPUT 
3
1 4 4 6 1
4 3 6 6 2
2 2 5 4 3
SAMPLE OUTPUT 
35
Explanation

![image ](https://he-s3.s3.amazonaws.com/media/uploads/cf5a67b.png)

For given sample input (see given graph for reference), compensation money for different farmers is as follows:

Farmer with land area A:    C1 = 5 * 1 = 5
Farmer with land area B:    C2 = 6 * 2 = 12
Farmer with land area C:    C3 = 6 * 3 = 18

Total Compensation Money = C1 + C2 + C3 = 5 + 12 + 18 = 35