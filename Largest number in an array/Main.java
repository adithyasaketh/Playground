import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr1[];
        int g = 0;
      int max;
        arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
          arr1[i] = in.nextInt();
        }
      if(arr1[0]>arr1[1])
       max = arr1[0];
      else
        max = arr1[1];
      for(int j=2;j<n;j++)
      {
        if(arr1[j] > max)
        max = arr1[j];
    
        }
        System.out.println(max);
      }
    }