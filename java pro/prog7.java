/*to find sum of any number of integers interactively,enter every number from the keyboard, whereas the total number of integers is given as a command line agument.*/
import java.util.Scanner;
class prog7{
public static void main(String args[])
{
 int num,sum=0,c;
 Scanner scan=new Scanner(System.in);
 do{
 System.out.println("Enter the number:");
 num=scan.nextInt();
 sum+=num;
 System.out.println("Sum of the number is:"+sum);
 System.out.println("If you want to continue this program then press 1:");
 c= scan.nextInt();
 }while(c==1);
  }
}





