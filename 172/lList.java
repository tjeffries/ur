class llNode{
	protected llNode next;
	protected String data;
	//constructors:
	public llNode(){
		next = null;
		data = null;
	}
	public llNode(llNode inLink, String inData){
		next = inLink;
		data = inData;
	}
}

public class lList{
	protected llNode head;
	protected llNode tail;
	public int size;

	public lList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public llNode getHead(){
		return head;
	}
	public int append(String inData){
		llNode n = new llNode(null, inData);
		if(size==0){
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
		size++;
		return 0;
	}
	public int push(String inData){
		llNode n = new llNode(null, inData);
		n.next = head;
		head = n;
		return 0;
	}

	public String pop(){
		String s = head.data;
		head = head.next;
		return s;
	}
	
	public String peek(){
		return head.data;
	}

	public String toString(){
		String tmpString = "";
		llNode tmpNode = head;
		while(true){
			tmpString += tmpNode.data;
			tmpNode = tmpNode.next;
			if(tmpNode == null) break;
			tmpString += ", ";
		}
		return tmpString;
	}
}
