package dataStructure;

//双端链表与单链表的区别在于它不只第一个链结点有引用，还对最后一个链结点有引用
public class DoubleEndList {
	private Link first;
	private Link last;

	public DoubleEndList() {
		first = null;
		last = null;
	}

	public void insertFirst(Link link) {
		if (isEmpty()) {
			last = link;
		}
		link.next = first;
		first = link;
	}

	public void insertLast(Link link) {
		if (isEmpty()) {
			first = link;
		} else {
			last.next = link;
		}
		last = link;
	}

	public Link deleteFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("链表为空！不能进行删除操作");
		}
		Link temp = first;
		if (first.next == null) {
			last = null; // 如果只有一个链结点，则删除后会影响到last指针
		}
		first = first.next;
		return temp;
	}

	// 打印出所有的链表元素
	public void displayList() {
		Link cur = first;
		while (cur != null) { // 循环打印每个链结点
			cur.displayLink();
			cur = cur.next;
		}
	}

	// 判空
	public boolean isEmpty() {
		return (first == null);
	}

}
