package getofferPart2;

public class delDuplica {
	static ListNode head = null;
	public ListNode deleteDuplication(ListNode pHead)
    {
                 
        if (pHead == null) return null;
        ListNode p = pHead;
        ListNode n = new ListNode(0);
        ListNode pre = n;
        n.next = pHead;
        boolean flag = false;
        while (p != null) {
            ListNode q = p.next;
            if (q == null) break;
            if (q.val == p.val) {
                while (q != null && q.val == p.val) {
                    q = q.next;
                }
                pre.next = q;//删除重复
                p = q;//移到下一位
            } else {
                if (!flag) {
                    n.next = p;
                    flag = true;
                }
                pre = p;
                p = q;
            }
        }
        return n.next;
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



//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
//重复的结点不保留，返回链表头指针。
//例如，链表1->2->3->3->4->4->5 处理后为 1->2->5 