import java.util.*;
import java.lang.*;
import java.io.*;

class horizontal_line
{
    public static void print_horizontal_line(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("*");   
        }
        System.out.println("\n");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
            System.out.print("Enter a value :");
	    BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	    n=Integer.parseInt(br.readLine());
		print_horizontal_line(n);
		
	}
}

