import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int i;
      int mul = 1 ;
        for(i=1;i<=n1;i++)
        {
          mul = mul * i;
            //System.out.println(mul);
        }
            System.out.println(mul);
	   
}
}