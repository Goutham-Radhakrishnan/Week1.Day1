package week1day1;

public class fibonacciSeries 
{
public static void main(String[] args)
{
int range=8, firstNumb=0, secondNumb=1,sum;
System.out.println(firstNumb);
System.out.println(secondNumb);
for(int i=1;i<range-1;i++)
{
	sum= firstNumb+secondNumb;
	firstNumb=secondNumb;
	secondNumb=sum;
	System.out.println(sum);
}
}
}
