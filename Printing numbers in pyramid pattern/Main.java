import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        for(int i=1;i<=n;i++)
        {
          for(int sp = 1;sp<=n-i;sp++)
          System.out.print(" ");
          for(int j=1;j<=i;j++)
          {
            //System.out.print(" ");
            System.out.print(count);
            count = count + 1;
            System.out.print(" ");
            //System.out.print(" ");
          }
          System.out.print("\n");
          
          
        }
}
}