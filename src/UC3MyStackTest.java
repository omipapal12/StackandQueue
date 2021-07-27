public class UC3MyStackTest {
	public static void main(String[] args) {
		 INode myFirstNode = new MyNode<Integer>(70);
	        INode mySecondNode = new MyNode<Integer>(30);
	        INode myThirdNode = new MyNode<Integer>(56);
	        MyStack myStck = new MyStack(3);
	        myStck.push(myFirstNode);
	        myStck.push(mySecondNode);
	        myStck.push(myThirdNode);
	        myStck.printStack();

	}
}
