public class MyStack {
	 MyLinkedList myLinkedList= new MyLinkedList();
	    private int default_size=3;

	    public MyStack(MyLinkedList myLinkedList) {
	        this.myLinkedList = myLinkedList;
	    }

	    public MyStack(int size) {
	        this.myLinkedList = myLinkedList;
	        this.default_size = default_size;
	    }
	    public void push(INode node){
	        myLinkedList.add(node);

	    }
	    public void printStack()
	    {
	        myLinkedList.printNodes();
	    }
	    public INode pop(){
	        return myLinkedList.pop();
	    }
	    public INode peek(){
	        return myLinkedList.head;
	    }
	    public boolean isEmpty(){
	        return myLinkedList.size()==0;
	    }
	    public boolean isFull(){
	        return myLinkedList.size() ==default_size;
	    }
	    public int size(){
	        return myLinkedList.size();
	    }
}