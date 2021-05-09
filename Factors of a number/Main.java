import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int i;
        for(i=1;i<=n1/2;i++)
        {
          if(n1%i==0)
            System.out.println(i);
        }
            System.out.println(n1);
	   
}
}