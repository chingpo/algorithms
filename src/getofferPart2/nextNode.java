package getofferPart2;

public class nextNode {
	//给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
	//注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。 
	public static class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {//思路：分为三种情况：  
   //1.处理没有父亲节点，即根节点情况,找右子树的最左孩子  
   //2.自己是父亲的左子树输出父亲  
   //3.自己是父亲的右子树分为两种情况  
   //  3-1：自己有右孩子，输出右孩子  
   //  3-2：在自己的父亲及上面找到一个节点是它父亲的左孩子，如果一直找不到说明他是最后的一个节点 
        if(pNode == null ){
            return null;
        }
        if(pNode.right != null){//情况1
            TreeLinkNode node= pNode.right;//右子树的根节点
            while(node.left !=null){//一直走到左下
                node = node.left;
            }
            return node;
        }else {
            if(pNode.next==null || pNode.next.left == pNode){//无右子树且为其父结点的左孩子结点
                return pNode.next;
            }else{//无右子树且为其父结点的右孩子结点
                TreeLinkNode p = pNode.next;
                while(p.next!=null && p!=p.next.left){
                    p = p.next;
                }
                return p.next;
            }
        }
    }
	/*
	 *    1
	 *    /\
	 *   2  3
	 *   /  /\
	 *  4   5 6
	 *  /   /\ /
	 *  7  8 9 10
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		TreeLinkNode root=new TreeLinkNode(1);
		TreeLinkNode a=new TreeLinkNode(2);
		TreeLinkNode b=new TreeLinkNode(3);
		TreeLinkNode c=new TreeLinkNode(4);
		TreeLinkNode d=new TreeLinkNode(5);
		TreeLinkNode e=new TreeLinkNode(6);
		TreeLinkNode f=new TreeLinkNode(7);
		TreeLinkNode g=new TreeLinkNode(8);
		TreeLinkNode h=new TreeLinkNode(9);
		TreeLinkNode i=new TreeLinkNode(10);
		root.left=a;root.right=b;root.next=null;
		a.left=c;a.right=null;a.next=root;
		b.left=d;b.right=e;b.next=root;
		c.left=f;c.right=null;c.next=a;
		d.left=g;d.right=h;d.next=b;
		e.left=i;e.right=null;e.next=b;
		f.left=null;f.right=null;f.next=c;
		g.left=null;g.right=null;g.next=d;
		h.left=null;h.right=null;h.next=d;
		i.left=null;i.right=null;i.next=e;
		nextNode eg=new nextNode();
		System.out.println(eg.GetNext(root).val);
		System.out.println(eg.GetNext(a).val);
		System.out.println(eg.GetNext(b).val);
		System.out.println(eg.GetNext(c).val);
		System.out.println(eg.GetNext(d).val);
//		System.out.println(eg.GetNext(e).val);		
		System.out.println(eg.GetNext(f).val);
		System.out.println(eg.GetNext(g).val);
		System.out.println(eg.GetNext(h).val);
		System.out.println(eg.GetNext(i).val);
	
		
	}

}
