import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =  new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++)
    {
      arr[i] = in.nextInt();
      //System.out.println(arr[i]);
    }
    int max = arr[0];
    if(arr[1] > max)
    max = arr[1];
    else
    max = max;
    for(int i=2;i<n;i++)
    {
      if(arr[i] > max )
      max = arr[i];
      else
        max = max;
    
  }
    //System.out.println(max);
    for(int i=0;i<n;i++)
    {
      if(arr[i] == max)
        System.out.println(i);
        
        }
  }
}