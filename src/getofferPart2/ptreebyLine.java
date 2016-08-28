package getofferPart2;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
 * 输入一颗二元树，从上往下按层打印树的每个结点，同一层中按照从左往右的顺序打印。   
例如输入
  8
  / \
 6 10
/ \ / \
5 7 9 11

输出8 6 10 5 7 9 11。
 * 
 * 
 * 
 * */
public class ptreebyLine {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	 static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		        if(pRoot == null){
		            return result;
		        }
		        Queue<TreeNode> layer = new LinkedList<TreeNode>();
		        ArrayList<Integer> layerList = new ArrayList<Integer>();
		        layer.add(pRoot);
		        int start = 0, end = 1;
		        while(!layer.isEmpty()){
		            TreeNode cur = layer.remove();
		            layerList.add(cur.val);
		            start++;
		            if(cur.left!=null){
		                layer.add(cur.left);           
		            }
		            if(cur.right!=null){
		                layer.add(cur.right);
		            }
		            if(start == end){
		                end = layer.size();
		                start = 0;
		                result.add(layerList);
		                layerList = new ArrayList<Integer>();
		            }
		        }
		        return result;
		    }
//层不分组		    
//	 ArrayList<Integer> intList=new ArrayList<Integer>();  
//     ArrayList<TreeNode> treeList=new ArrayList<TreeNode>();  
//     if(pRoot==null){ 
//
//         return intList;  
//     }  
//     treeList.add(pRoot);  
//     for(int i=0;i<treeList.size();i++){  
//         TreeNode node= treeList.get(i);  
//         if(node.left!=null){  
//             treeList.add(node.left);  
//         }  
//         if(node.right!=null){  
//             treeList.add(node.right);  
//         }  
//         intList.add(node.val);
//     }  
//     return intList;  
	   public static void main(String[] args) {
		TreeNode root=new TreeNode(8);
		TreeNode a=new TreeNode(6);
		TreeNode b=new TreeNode(10);
		TreeNode c=new TreeNode(5);
		
		TreeNode d=new TreeNode(7);
		TreeNode e=new TreeNode(9);
		TreeNode f=new TreeNode(11);
		root.left=a;root.right=b;	
		a.left=c;a.right=d;
		b.left=e;b.right=f;
		c.left=null;c.right=null;
		d.left=null;d.right=null;
		e.left=null;e.right=null;
		f.left=null;f.right=null;
		
		System.out.println(Print(root));
	   } 

}
