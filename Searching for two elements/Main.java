import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c;
        int arr1[];
        int count = 0;
        arr1 = new int[n];
        for(int i=0;i<=n-1;i++)
        {
          arr1[i] = in.nextInt();
          //System.out.print(arr1[i]);
        }
        int n1 = in.nextInt();
        int n2 = in.nextInt();
      for(int j=0;j<n;j++)
      {
        if (arr1[j] == n1)
            System.out.println(j);
        else if(arr1[j] == n2)
            System.out.println(j);
       else if((arr1[j] != n1) || (arr1[j] != n2))
       {count++;
        if(count == n-1)
          System.out.println("-1");
       }
      }
      
    }
}
