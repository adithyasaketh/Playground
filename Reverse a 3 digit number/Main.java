import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int n1 = in.nextInt();
   int f = n1/100;
   int h = n1%100;
   int s = h/10;
   int t = n1%10;
   //System.out.println(t);
   System.out.println(t+""+s+""+f);
   //System.out.println(f);
  }
}