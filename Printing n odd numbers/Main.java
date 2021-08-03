import java.util.Scanner;
class Main {
	public static void main (String[] args){
         Scanner in = new Scanner(System.in);
         int n1 = in.nextInt();
         int i;
         int count = 0;
	     for(i=1;i<=2*n1;i++)
              {
                  if(count!=n1)
                  {
                      if(i%2!=0)
                        {
                           System.out.println(i);
                           count = count + 1;
                        }
                  }
                   else
                     break;
          
           
             
         }
	}
}