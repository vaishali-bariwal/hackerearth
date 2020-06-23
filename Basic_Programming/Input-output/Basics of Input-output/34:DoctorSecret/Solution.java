import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int  book_len = Integer.parseInt(arr[0]);
        int  pages_book = Integer.parseInt(arr[1]);
        if(book_len <= 23 && pages_book > 500 && pages_book <= 1000)
        {
            System.out.println("Take Medicine");
        }
        else{
            System.out.println("Don't take Medicine");
        }
    }
}
