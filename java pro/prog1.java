//to find the sum of any integers entered as command line arguments.
import java.io.*;

public class prog1{
    public static void main(String args[])
    {
	 int num,sum=0;
     System.out.println("Command line Argument are 10,20,30");
      for(int i=0; i<args.length; i++)
      { num=Integer .parseInt(args[i]);
       sum=sum+num;
      }
      System.out.println("Sum of Elements is:" + sum);
    }
}