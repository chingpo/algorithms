package getofferPart2;
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;
 
    RandomListNode(int label) {
        this.label = label;
    }
}
public class randomList {
	 public RandomListNode Clone(RandomListNode pHead)
	    {
	        if(pHead==null) return pHead;
	        RandomListNode pNode=pHead;
	        while(pNode!=null){
	        	int val=pNode.label;
	        	 RandomListNode randomListNode = new RandomListNode(val);
	             randomListNode.next = pNode.next;
	             pNode.next = randomListNode;
	             pNode = randomListNode.next;
	        }
	        pNode = pHead;
	        while (pNode != null) {
	            RandomListNode next = pNode.next;
	            RandomListNode random = pNode.random;
	            if (random != null)
	                next.random = random.next;
	            pNode = next.next;
	        }
	        pNode = pHead;
	        RandomListNode second = pHead.next;
	        while (pNode != null) {
	            RandomListNode next = pNode.next;
	            pNode.next = next.next;
	            pNode = next.next;
	            if (pNode != null)
	                next.next = pNode.next;
	        }
	        return second;
	    }
}
