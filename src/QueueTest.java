
public class QueueTest {
	public static void main(String[] args) {
	INode myFirstNode = new MyNode<Integer>(70);
    INode mySecondNode = new MyNode<Integer>(30);
    INode myThirdNode = new MyNode<Integer>(56);
    MyQueue myQueue = new MyQueue(3);
    myQueue.push(myFirstNode);
    myQueue.push(mySecondNode);
    myQueue.push(myThirdNode);
    myQueue.printQueue();
	}
}