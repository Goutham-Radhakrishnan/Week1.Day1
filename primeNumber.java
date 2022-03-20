package week1day1;

public class primeNumber 
{
public static void main(String[] args) 
{
int numb=13;
boolean isPrime=true;

for(int i=2;i<numb-1;i++)
{
	if(numb%i==0)
	{
		System.out.println("The Number is not PRIME");
		isPrime=false;
		break;
	}
	}
if(isPrime==true)
{
System.out.println("The Number is PRIME");	

}

}
}
