import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
         int n1 = in.nextInt();
         int i;
         int sum = 0;
	     for(i=1;i<=n1;i++)
         {
             sum = sum + i;
          }
      System.out.println(sum);
}
}