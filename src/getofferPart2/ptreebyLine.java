package getofferPart2;



import java.util.ArrayList;
import java.util.Iterator;
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
	
	
	
	
	
//	 static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
//		        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//		        if(pRoot == null){
//		            return result;
//		        }
//		        Queue<TreeNode> layer = new LinkedList<TreeNode>();
//		        ArrayList<Integer> layerList = new ArrayList<Integer>();
//		        layer.add(pRoot);
//		        int start = 0, end = 1;
//		        while(!layer.isEmpty()){
//		            TreeNode cur = layer.remove();
//		            layerList.add(cur.val);
//		            start++;
//		            if(cur.left!=null){
//		                layer.add(cur.left);           
//		            }
//		            if(cur.right!=null){
//		                layer.add(cur.right);
//		            }
//		            if(start == end){
//		                end = layer.size();
//		                start = 0;
//		                result.add(layerList);
//		                
//		                layerList = new ArrayList<Integer>();
//		            }
//		        }
//		        return result;
//		    }
	
	
	/*按层序遍历分层打印的代码，添加一段判断用以倒序输出即可*/
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return result;
        }
        boolean leftToRight = true;
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
                if(!leftToRight){
                    result.add(reverse(layerList));
                }else{
                    result.add(layerList);
                }
                leftToRight = !leftToRight;
                layerList = new ArrayList<Integer>();
            }
        }
        return result;
    }
    private static ArrayList reverse(ArrayList<Integer> layerList) {    
        int length = layerList.size();
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        for(int i = length-1; i >= 0;i--){
            reverseList.add(layerList.get(i));
        }
        return reverseList;
    }	
	
	
	
//	/**
//
//	 * 下面的实现：不必将每层的数据存进ArrayList中，偶数层时进行reverse操作，直接按打印顺序存入
//	 * 思路：利用Java中的LinkedList的底层实现是双向链表的特点。
//	 *     1)可用做队列,实现树的层次遍历
//	 *     2)可双向遍历,奇数层时从前向后遍历，偶数层时从后向前遍历
//	 */
//	//之字形
//	 public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//		    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
//		    if (pRoot == null) {
//		        return ret;
//		    }
//		    ArrayList<Integer> list = new ArrayList<>();
//		    LinkedList<TreeNode> queue = new LinkedList<>();
//		    queue.addLast(null);//层分隔符
//		    queue.addLast(pRoot);//size=2
//		    boolean leftToRight = true;		     
//		    while (queue.size() != 1) {
//		        TreeNode node = queue.removeFirst();
//		        if (node == null) {//到达层分隔符
//		            Iterator<TreeNode> iter = null;
//		            if (leftToRight) {
//		                iter = queue.iterator();//从前往后遍历
//		            } else {
//		                iter = queue.descendingIterator();//从后往前遍历 wawaaaaa,我之前肿么不知道这个神器！！！
//		            }
//		            leftToRight = !leftToRight;
//		            while (iter.hasNext()) {
//		                TreeNode temp = (TreeNode)iter.next();
//		                list.add(temp.val);//装完一层
//		            }
//		            ret.add(new ArrayList<Integer>(list));//层结果添加到结果数组中
//		            list.clear();//清空层list
//		            queue.addLast(null);//添加层分隔符
//		            continue;//一定要continue
//		        }
//		        if (node.left != null) {
//		            queue.addLast(node.left);
//		        }
//		        if (node.right != null) {
//		            queue.addLast(node.right);
//		        }
//		    }
//		     
//		    return ret;
//		}
	
	
	
	
	
	
	

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
