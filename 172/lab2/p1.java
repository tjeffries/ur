/*
*Author: Thomas Jeffries
*Lab 2, problem 1
*/
public class p1{
	protected static int k; //number of possible values
	protected static int n; //number of items
	
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("please enter two integers in format values, items");
			System.exit(1);
		}
		k = Integer.parseInt(args[0]);
		n = Integer.parseInt(args[1]);
		System.out.printf("values: %d items: %d\n", k, n);
		
		System.out.printf("number of assignments: %d\n", (int)(Math.pow(k,n)));
	}
}
