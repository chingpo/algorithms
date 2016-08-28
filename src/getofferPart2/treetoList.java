package getofferPart2;

import dataStructure.BinaryTree.Node;


/* 
把二元查找树转变成排序的双向链表 
题目： 
输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。 
要求不能创建任何新的结点，只调整指针的指向。 
10 
/ \ 
6 14 
/ \ / \ 
4 8 12 16 
转换成双向链表 
4=6=8=10=12=14=1 
   */  
/*

1.二叉树中序遍历的结果与链表的顺序一致，所以可以采用中序遍历的方法来修改二叉树的指针

2.该题的关键是，如何将左子树的最大值与右子树的最小值通过根root连接起来，比如题目的8和12，这也是细节部分

3.写递归程序最重要的是弄明白递归进入的条件、递归返回的状态，如果递归进入时改变了环境，返回时应当恢复环境，就像栈的操作一样

4.使用指针变量时，要记得初始化

5.该算法没有返回链表头，而是返回了root。

10 
/ \ 
6 14 
/ \ / \ 
4 8 12 16 

*/
public class treetoList {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	 public TreeNode Convert(TreeNode pRootOfTree) {
	        TreeNode lastNode=null;
	        TreeNode headNode=ConvertNode(pRootOfTree,lastNode);
	        while(headNode!=null&&headNode.left!=null){
	        	headNode=headNode.left;
	        }
	        return headNode;
	    }

	public TreeNode ConvertNode(TreeNode rootTree, TreeNode lastNode) {
		if(rootTree==null){
			return null;
		}
		if(rootTree.left!=null){
			lastNode=ConvertNode(rootTree.left,lastNode);
		}
		rootTree.left = lastNode;  
        if (lastNode != null) {  
            lastNode.right = rootTree;  
        }  
        lastNode = rootTree;  
        if (rootTree.right != null) {  
            lastNode=ConvertNode(rootTree.right, lastNode);  
        }  
        return lastNode;
	
		
	}
	 public void inorder(TreeNode currentRoot){  
	        if(currentRoot != null){  
	               inorder(currentRoot.left);  //先对当前节点的左子树对进行中序遍历  
	               System.out.print(currentRoot.val+"\t"); //然后访问当前节点  
	               inorder(currentRoot.right);  //最后对当前节点的右子树对进行中序遍历  
	        }  
	 } 
	public static void main(String[] args) {
		treetoList b=new treetoList();
		TreeNode root=new TreeNode(10);
		TreeNode six=new TreeNode(6);
		TreeNode four=new TreeNode(4);
		TreeNode eight=new TreeNode(8);
		TreeNode fourteen=new TreeNode(14);
		TreeNode twelve=new TreeNode(12);
		TreeNode sixteen=new TreeNode(16);
		root.left=six;root.right=fourteen;
		six.left=four;six.right=eight;
		fourteen.left=twelve;fourteen.right=sixteen;
		four.left=null;
		four.right=null;
		eight.left=null;
		eight.right=null; 
		twelve.left=null;
		twelve.right=null;
		sixteen.right=null;
		sixteen.left=null; 	
		b.inorder(root);
		System.out.println();
		TreeNode re=b.Convert(root);
		while(re!=null){
			System.out.print(re.val+"\t");
			re=re.right;
		}
	}

}
