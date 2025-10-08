package javaproject.javaproject2day;

import java.util.Scanner;

public class Numberofdig {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num=3784784

;
System.out.println("Enter digits");
int count=0;
while(num>0)
{
 num = num/10;
 count++;
}
System.out.println("number of digits "+ count);
}
	
}
