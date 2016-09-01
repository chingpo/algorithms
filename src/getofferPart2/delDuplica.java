package getofferPart2;
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
//重复的结点不保留，返回链表头指针。
//例如，链表1->2->3->3->4->4->5 处理后为 1->2->5 
public class delDuplica {
	static ListNode head = null;
	public ListNode deleteDuplication(ListNode pHead)
    {
                 
		if (pHead == null) {
			return null;
		}
		ListNode preNode = null;
		ListNode node = pHead;
		while (node != null) {
			if (node.next != null && node.val == node.next.val) {
				int value = node.val;
				while (node.next != null && node.next.val == value) {
					node = node.next;
				}
				if (preNode == null) {
					pHead = node.next;
				} else {
					preNode.next = node.next;
				}
			} else {
				preNode = node;
			}
            node = node.next;
		}
		return pHead;
    }
	 public void addNode(int d) {
	        ListNode newNode = new ListNode(d);// 实例化一个节点
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        ListNode tmp = head;
	        while (tmp.next != null) {
	            tmp = tmp.next;
	        }
	        tmp.next = newNode;
	    }
	  public void printList() {
		  ListNode tmp = head;
	        while (tmp != null) {
	            System.out.print(tmp.val);
	            System.out.print("->");
	            tmp = tmp.next;
	        }
	    }
	 public static void main(String[] args) {
		 delDuplica list = new delDuplica();
	        list.addNode(1);
	        list.addNode(2);
	        list.addNode(3);
	        list.addNode(3);
	        list.addNode(3);
	        list.addNode(4);
	        list.addNode(5);
	        list.printList();
	        list.deleteDuplication(head);
	        System.out.println("After deleteNode():");
	        list.printList();
	}
	
}

