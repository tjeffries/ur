public class llTest{
	
	public static void main(String[] args){
		//System.out.println("main start");
		
		lList things = new lList();
		things.append("hello");
		things.append("hello again");
		//System.out.println(things.peek());
		for(int i=0; i<1000; i++){
			things.append(String.valueOf((int)(Math.random()*1000)));
		}
		System.out.println(things.toString());
	}
}
