import java.util.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int hurdles=s.nextInt();
            long power=s.nextLong();
            int a[]=new int[hurdles];
            for(int j=0;j<hurdles;j++){
                a[j]=s.nextInt();
            }
            int time=0;
            for (time=0;power>=0 && time<hurdles;time++) {
                if(a[time]%2==0) {
                    a[time]-=time;
                } else {
                    if(time>0) {
                        a[time]-=(time-1);
                    }
                }
                if (a[time]>0){
                    power -=a[time];
                }
                
            }
            if (power>=0 && time == hurdles) {
                System.out.println("Yes "+power);
            } else {
                System.out.println("No");
            }
    }
}
}
