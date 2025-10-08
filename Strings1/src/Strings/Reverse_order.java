package Strings;

public class Reverse_order {
public static void main(String[] args) {
	String sentence = "GPK";
	String reversed = "";
	String[] word = sentence.split("");
	for(int i = word.length-1;i>=0; i--)
	{
		reversed += word[i] + "";
	}
	System.out.println("Reversed string is : "+reversed);
}
}
