package javaproject.javaproject2day;

public class Armstrong {
public static void main(String[] args) {
	int num =153 ;
	int original=num;
	int sum=0;
	while(num>0)
	{
		int digit = num%10;
		sum=sum+(digit*digit*digit);
		num=num/10;
	}
	if(sum==original)
	{
		System.out.println("It's an armstrong number");
	}
	else
	{
		System.out.println("It's not an armstrong number");
	}
}
}

