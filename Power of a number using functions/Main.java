import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
	    int exponent = in.nextInt();
	    int c = pow(base,exponent);
	    System.out.println(c);
	    
	    
	}
	// Function to find the prime number
	public static int pow(int m,int n)
	{
	  int power = 1;  
      for(int i = 1; i <= n; i++)
	    {
            power = power * m;
	    }
	    return power;
	}
}// End of Main class