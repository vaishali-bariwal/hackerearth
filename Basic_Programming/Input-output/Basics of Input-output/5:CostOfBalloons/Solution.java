
import java.util.*;

class Solution{
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int zero_in_row1 = 0 ,zero_in_row2 =0;
            int gcost = sc.nextInt();
            int pcost = sc.nextInt();
            int highcost = 0,lowcost  =0;
            if(gcost<pcost)
            {
                highcost = pcost;
                lowcost = gcost;
            }
            else{
                highcost = gcost;
                lowcost = pcost;
            }
            
            int n = sc.nextInt();
            int a[][] = new int[n][2];
            for(int j =0;j<n;j++){
                for(int k =0;k<2;k++){
                    a[j][k] = sc.nextInt();
                    if(a[j][k]==0&&k==0)
                    { zero_in_row1++;}
                    if(a[j][k]==0&&k==1)
                    {zero_in_row2++;}
                }
            }
            int min_price = 0;
            if(zero_in_row1 > zero_in_row2)
            {
                min_price = ((n - zero_in_row1) * highcost) + ((n - zero_in_row2) * lowcost);
            }
            else
            {
               min_price = ((n - zero_in_row1) * lowcost) + ((n - zero_in_row2) * highcost);
            
            }
            System.out.println(min_price);
        }
       

    }
}
