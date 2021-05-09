import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    int key = in.nextInt();
    int offset;
    if(ch>='a' && ch<='z')
    {offset = (ch-'a');
    //System.out.print(offset);
    int val =( ch - key + 26);
    char value = (char)val;
    System.out.print(value);}
    else if(ch>='A' && ch<='Z')
    {offset = (ch-'A');
    //System.out.print(offset);
    int val = (ch - key );
    char value = (char)val;
    System.out.print(value);}  
    
      
      
      
    }
}