package getofferPart2;

import java.util.ArrayList;

//输入一个链表，输出该链表中倒数第k个结点。 
class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
public class listBasic {

	public static ListNode FindKthToTail(ListNode head,int k) {
		if(head==null) return head;
		ListNode node=head;
		int count=0;
		while(node!=null){
			count++;
			node=node.next;
		}
		if(count<k) return null;
		ListNode p=head;
		for(int i=0;i<count-k;i++){
			p=p.next;
		}
		return p;
	    }
	public static void main(String[] args) {
		 ListNode listNode = new ListNode(1);
	        listNode.next = new ListNode(2);
	        listNode.next.next = new ListNode(3);

	        //输入该链表求出该链表倒数第二个节点
	        ListNode node = FindKthToTail(listNode, 2);
	        System.out.println(node.val);
	}

}
