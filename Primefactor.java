import java.util.*;
import java.lang.*;
import java.io.*;

class Primefactor
{
    public static void print_primeFactors(int n)
    {
       int count, i, isPrime_flag;  
    
    
    System.out.print("Prime Factors are :");  
   
      for(count = 2; count <= n; count++) {  
         
        if(n%count==0) {
            
            isPrime_flag = 1;
            for(i = 2; i <=(count/2); i++) {
                if(count%i==0) {
                    isPrime_flag=0;
                    break;
                }
            }
    
            if(isPrime_flag==1)
                System.out.print(count+" ");  
      } }
        System.out.println("");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
            int n;
            System.out.print("Enter a number : ");
	    BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	    n=Integer.parseInt(br.readLine());
	    print_primeFactors(n);   
	}
}

