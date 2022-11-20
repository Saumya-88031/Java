//to convert decimal to binary number.
import java.util.Scanner;
class prog5{
public static void main(String args[])
{
 int binary[]=new int[20];
 int num,i=0;
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter the number that you want to convert decimal into binary:");
 num=scan.nextInt();
 while(num!=0)
 {
  binary[i]=num%2;
  num/=2;
  i++;
 }
 System.out.println("Binary number is:");
 for (int j=i-1; j>=0; j--)
 System.out.print(binary[j]+"");
}
}