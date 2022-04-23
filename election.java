public class Election
{
public static void main(String args[])
{
double vote1=1136;
double vote2=7636;
double vote3=11628;
double sum;
double p;
sum=vote1+vote2+vote3;
System.out.println(sum);
p=(11628/sum)*100;
System.out.println("percentage of the total votes the winning candidate get:"+p);
}
}