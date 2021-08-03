import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n = n1;
        int casu = n1;
        int i;
        int count = 0;
      double sum =0;
        while(casu>0)
        {
          casu = casu/10;
          count++;
        }
        //System.out.println(count);
          
        for(i=1;i<=count;i++)
        {
            int sonu = n1%10;
            //System.out.println(sonu);
            //System.out.println(count);
            double f =  Math.pow(sonu , count);
            sum = sum + f;
            n1 = n1/10;
        }
        //System.out.println(sum);    
         double am = n;
         //System.out.println(am);
         if(am==sum)
           System.out.println("Armstrong Number");
         else
           System.out.println("Not a Armstrong Number");
        }
            //System.out.println(Not a Armstrong Number);
	   
}

	
