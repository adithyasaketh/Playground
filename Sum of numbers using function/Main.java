import java.util.Scanner;
class Main
{
    public static int square(int n)
    {
      int sq = 0;
      for(int i=0;i<=n;i++)
      {
        sq = sq + i ;
      }
        return sq;
    }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int c = square(n);
     System.out.println(c);
       
	} 
}