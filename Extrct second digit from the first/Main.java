import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int asd = n1;
      int f = n1;
      int i;
      int count =0;
      while(n1>0)
      {
        n1 = n1/10;
        count = count + 1;
      }
        //System.out.println(count);
      
      for(i=0;i<count-2;i++)
       asd = asd/10;
      //
      f = asd%10;
      System.out.println(f);
      
      
      
      }
    
}