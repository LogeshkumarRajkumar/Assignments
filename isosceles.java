import java.util.*;
import java.lang.*;
import java.io.*;

class isosceles
{
    public static void draw_isosceles(int n)
    {
       for(int j=0;j<n;j++)
       {
         for(int k=j;k<n;k++)
         {
            System.out.print(" "); 
         }
         for(int i=0;i<((2*j)+1);i++)
         {
            System.out.print("*");   
         }
         System.out.println("");
       }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
	    BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	    n=Integer.parseInt(br.readLine());
		draw_isosceles(n);
		
	}
}

