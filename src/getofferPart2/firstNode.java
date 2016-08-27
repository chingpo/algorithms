package getofferPart2;

public class firstNode {
	
	public class ListNode {
	    int val;
	    ListNode next = null;
	 
	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
	  int length1=GetListLength(pHead1);
	  int length2=GetListLength(pHead1);
	  int more=length1-length2;
	  ListNode pLong=pHead1,pShort=pHead2;
	  if(length1<length2){
		  more=length2-length1;
		  pLong=pHead2;
		  pShort=pHead1;
	  }
	  while(more>0){
		  pLong=pLong.next;
		  more--;
	  }
	  ListNode pCommon=null;
	  while(pLong!=null&&pShort!=null){
		  pLong=pLong.next;
		  pShort=pShort.next;
		  if(pLong==pShort){
			  pCommon=pLong;
			  break;
		  }
	  }
	  return pCommon;
	}
	private static int GetListLength(ListNode pHead1) {
        int length = 0;
        while (pHead1 != null) {
            length++;
            pHead1 = pHead1.next;
        }
        return length;
    }
	
}

//下边的问号脸到底是   那么短的那个链表的指针pn（也就是p1或p2） 意思不是说的尾节点么？？？？？？？
/**
 * 思路：如果有公共节点，1）若两个链表长度相等，那么遍历一遍后，在某个时刻，p1 == p2
 *                   2)若两个链表长度不相等，那么短的那个链表的指针pn（也就是p1或p2）
 *                     必先为null，那么这时再另pn = 链表头节点。经过一段时间后，
 *                     则一定会出现p1 == p2。
 *      如果没有公共节点：这种情况可以看成是公共节点为null，顾不用再考虑。
 */
//ListNode p1 = pHead1;
//ListNode p2 = pHead2;
//while(p1 != p2) {
//    if(p1 != null) p1 = p1.next;    //防止空指针异常
//    if(p2 != null) p2 = p2.next;
//    if(p1 != p2) {                  //当两个链表长度不想等
//        if(p1 == null) p1 = pHead1;
//        if(p2 == null) p2 = pHead2;
//    }
//}
//return p1;
