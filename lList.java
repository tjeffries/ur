class llNode{
	protected llNode link;
	protected String data;
	//constructors:
	public llNode(){
		link = null;
		data = null;
	}
	public llNode(llNode inLink, String inData){
		link = inLink;
		data = inData;
	}
	//methods:
	public llNode getLink(){
		return link;
	}

	public int setLink(llNode inLink){
		link = inLink;
		return 0;
	}

	public String getData(){
		return data;
	}

	public int setData(String inData){
		data = inData;
		return 0;
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
	public lList(llNode inHead){
		head = inHead;
		tail = inHead;
		size = 1;
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
			tail.setLink(n);
			tail = n;
		}
		return 0;
	}
	public int push(String inData){
		llNode n = new llNode(null, inData);
		n.setLink(head);
		head = n;
		return 0;
	}

	public String pop(){
		String s = head.getData();
		head = head.getLink();
		return s;
	}
	
	public String peek(){
		return head.getData();
	}
}
