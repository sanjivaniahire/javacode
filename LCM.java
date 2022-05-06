import java.util.scanner;
public class LCMProgram{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Ratio:");
int i=sc.nextInt();
int j=sc.nextInt();
int k=i*j;
System.out.println("Enter LCM: ");
int LCM=sc.nextInt();
int m=LCM/k;
int a=m*i;
int b=m*j;
if(a>b)
{
System.out.println("Smaller number is "+b);
}
else
{
System.out.println("Smaller number is "+a);
}
}
