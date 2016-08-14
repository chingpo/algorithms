package dataStructure;

public class Queue {
	private int[] queArray;
	private int maxSize;
	public int front;
	public int rear;
	private int length;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		length = 0;
	}

	public void insert(int elem) throws Exception {
		if (isFull()) {
			throw new Exception("队列已满！");
		}
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queArray[++rear] = elem;
		length++;
	}

	// 移除
	public int remove() throws Exception{  
      if(isEmpty()){  
             throw new Exception("队列为空，不能进行移除操作！");  
      }  
      int elem = queArray[front++];  
      //如果队头指针已到达数组末端，则移到数组第一个位置  
      if(front == maxSize){  
             front = 0;  
      }  
      length--;  
      return elem;  
}
	// 查看队头元素
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("队列内没有元素！");
		}
		return queArray[front];
	}

	// 获取队列长度
	public int size() {
		return length;
	}

	// 判空
	public boolean isEmpty() {
		return (length == 0);
	}

	// 判满
	public boolean isFull() {
		return (length == maxSize);
	}

}
