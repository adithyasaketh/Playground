import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i=1;i*i<n;i++)
    {
    if(n%i == 0)
        System.out.print(i+" "+n/i+" ");
    }
    for(int j=1;j<n;j++)
      if(j*j == n)
    System.out.println(j);
    }
  }
