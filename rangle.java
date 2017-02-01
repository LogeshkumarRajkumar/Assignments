import java.util.*;
import java.lang.*;
import java.io.*;

class rangle
{
    public static void draw_rangle(int n)
    {
       for(int j=0;j<n;j++)
       {
         for(int i=j;i>=0;i--)
         {
            System.out.print("*");   
         }
         System.out.println(" ");
       }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
	    BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	    n=Integer.parseInt(br.readLine());
		draw_rangle(n);
		
	}
}
