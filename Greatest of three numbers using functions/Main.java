import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n1 = in.nextInt();
       int n2 = in.nextInt();
       int n3 = in.nextInt();
       int r = great(n1,n2,n3);
       System.out.println(r);
	}
public static int great(int a , int b, int c)
{
  if(a>b && a>c)
    return a;
  else if(b>a && b>c)
    return b;
  else
    return c;
}
}






