import java.util.*;
import java.lang.*;
import java.io.*;


class Fizzbuzz
{
    public static void generate_fizzbuzz()
    {
        for (int i=1;i<=100;i++)
        {
            if((i%3)==0 && (i%5)==0)
               System.out.println("FizzBuzz");
            else if(i%5==0)
               System.out.println("Buzz");
            else if(i%3==0)
               System.out.println("Fizz");
            else 
               System.out.println(i);
            
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		generate_fizzbuzz();
	}
}

