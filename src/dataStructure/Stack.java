package dataStructure;

public class Stack {
	private int size;
	private int top;//栈顶元素的下标
	private char[] stackArray;
	
	//构造函数
	public Stack(int size){
		stackArray=new char[size];
		top=-1;//初始化时无元素，栈顶下标为-1
		this.size=size;
	}
	
	public void push(char elem){
		stackArray[++top]=elem;
	}
	public char pop(){
		return stackArray[top--];
	}
	public char peek(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top==size-1);
	}
	
}
