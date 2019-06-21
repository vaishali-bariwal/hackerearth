

    import java.util.*;
    class TestClass {
        public static void main(String args[] ) throws Exception {
            Scanner s = new Scanner(System.in);
            int t = Integer.parseInt(s.nextLine());   
            long a[]=new  long [7];
            while(t>0)
            {
                long c=0,d=0,k =s.nextLong();
                for(int i=0;i<7;i++)
                a[i]=s.nextLong();
                for(int i=0;i<7;i++)
                   {
                       if(a[i]!=0){c=c+a[i];d=i;k=k-a[i];}
                       if(k<=0)break;
                   }
                if(k>c)
                k-=(k/c)*c;
                for(int i=0;i<7;i++)
                    {if(k!=0 && k>0){k=k-a[i];d=i;}
                      if(k<=0)break;  
                    }
                if(d==0) System.out.println("MONDAY");
                if(d==1) System.out.println("TUESDAY");
                if(d==2) System.out.println("WEDNESDAY");
                if(d==3) System.out.println("THURSDAY");
                if(d==4) System.out.println("FRIDAY");
                if(d==5) System.out.println("SATURDAY");
                if(d==6) System.out.println("SUNDAY");
                t--;
            }
        }
    }


