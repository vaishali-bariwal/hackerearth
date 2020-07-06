public class Main
{
  static String originalString="abcabc";
  
  private static int operationCount(String word, int p,int q){
        
      String str = word;
      int count =0;
      int l = word.length();
      
      do{
        word = word.substring(l-p, l) + word.substring(0,l-p);
        System.out.println(word);
        count++;
        if(str.equalsIgnoreCase(word)) break;
        word = word.substring(l-q, l)+ word.substring(0,l-p);;
        count++;
        System.out.println(word);
      }while(!str.equalsIgnoreCase(word));
    return count;
     
  }
  
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
     originalString=args[0];
    System.out.println(operationCount(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2])));
  }
}
