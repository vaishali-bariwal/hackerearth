

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = true;
        if(s.length()!=9)
        {
            System.out.println("invalid");
        }
        else{
            for(int i = 0;i<8;i++)
            {
                if(i!=2 && i!=6 && Character.isDigit(s.charAt(i)))
                {
                    if(i+1 !=2 && i+1 !=6 && Character.isDigit(s.charAt(i+1)))
                    {
                        if((Character.getNumericValue(s.charAt(i)) + Character.getNumericValue(s.charAt(i+1))) % 2 != 0){
                            flag = false;
                        }
                    }
                }
                else if(i==2 && Character.isLetter(s.charAt(i)))
                {
                    char c = s.charAt(i);
                    if(c =='A'||c=='I'||c=='O'||c=='U'||c=='E'||c=='Y')
                    {
                        flag = false;
                    }
                }
                else if(i==6 && s.charAt(i)=='-')
                {
                    continue;
                }
                else
                {
                    flag = false;
                }
                
            }//13Y357-22
            System.out.println(flag ? "valid": "invalid");
        }
    }
}
