package Strings;

public class substring {
public static void main(String[] args) {
	String a = "priya";
	String b = "ganaa";
	String c="kavuu";
	a=a+b+c;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	c=b.substring(0,b.length()-c.length());
	b=b.substring(c.length());
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("c:"+c);
}}