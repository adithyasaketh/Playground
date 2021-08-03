import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    char[] s1 = in.nextLine().toCharArray();
    char[] s2 = in.nextLine().toCharArray();
    Arrays.sort(s1);
    Arrays.sort(s2);
    int count=0;
    if(s1.length==s2.length)
    {
      for(int i=0;i<s1.length;i++)
      if(s1[i]==s2[i])
      count++;
    }
    if(count==s1.length)
      System.out.println("Anagram");
    else
      System.out.println("Not anagrams");
 	}
  }