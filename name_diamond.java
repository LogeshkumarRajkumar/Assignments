import java.util.*;
import java.lang.*;
import java.io.*;

class name_diamond
{
    public static void draw_name_diamond(int n)
    { int i,j,k;
       for(i=1; i<=n; i++)
       {
           for(j=i; j<n; j++)
          {
            System.out.print(" ");
          }
          if(i!=n)
          {
            for(j=1; j<=(2*i-1); j++)
            {
             System.out.print("*");
            }
          }
          else
          System.out.print("Custom Name");
          System.out.print("\n");
       }
 
    
      for(i=n; i>=1; i--)
      {
        for(j=i; j<=n; j++)
        {
            System.out.print(" ");
        }
        for(j=2; j<(2*i-1); j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
      }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
	    BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	    n=Integer.parseInt(br.readLine());
		draw_name_diamond(n);
		
	}
}

