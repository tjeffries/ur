/*
*Author: Thomas Jeffries
*Lab 2, problem 2
*/
import java.math.*;
public class p3{
	protected static BigInteger n; //number of distinct orderable objects
	protected static BigInteger m; //number of items selected sequentially
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("please enter two integers in form: items, number selected sequentially");
			System.exit(1);
		}
		n = new BigInteger(args[0]);
		m = new BigInteger(args[1]);
		System.out.printf("items: %d\n", n);
		System.out.printf("selected: %d\n", m);
		System.out.printf("number of ordered selections possible: %s\n", factorial(n).divide(factorial(n.subtract(m))).toString());
	}
	
	public static BigInteger factorial(BigInteger a){
		if(a.intValue()<=1)
			return new BigInteger("1");
		else
			return (a.multiply(factorial(a.subtract(new BigInteger("1")))));
	}
}
