
public class MyQueue {
	MyLinkedList myLinkedList= new MyLinkedList();
    private int default_size=3;

    public MyQueue(MyLinkedList myLinkedList) {
        this.myLinkedList = myLinkedList;
    }

    public MyQueue(int size) {
        this.myLinkedList = myLinkedList;
        this.default_size = default_size;
    }
    public void push(INode node){
        myLinkedList.add(node);

    }
    public void printQueue()
    {
        myLinkedList.printNodes();
    }
}
