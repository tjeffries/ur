/*
*Author: Thomas Jeffries
*Lab 2, problem 1
*/
import java.math.*;
public class p2{
	protected static BigInteger n; //number of distinct orderable objects
	
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("please enter one integer for number of distinct objects");
			System.exit(1);
		}
		n = new BigInteger(args[0]);
		System.out.printf("objects: %d\n", n);
		
		System.out.printf("number of permutations: %s\n", factorial(n).toString());
	}
	
	public static BigInteger factorial(BigInteger a){
		if(a.intValue()<=1)
			return new BigInteger("1");
		else
			return (a.multiply(factorial(a.subtract(new BigInteger("1")))));
	}
}
