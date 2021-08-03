import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n1 = in.nextInt();
    
      int c = n1%100;
      int d = c/10;
      //int d = b+c;
      System.out.println(d);
	}
}