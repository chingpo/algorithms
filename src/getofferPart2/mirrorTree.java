package getofferPart2;

import getofferPart2.ifSubtree.TreeNode;

public class mirrorTree {
public void Mirror(TreeNode root) {
	 if(root!=null&&(root.left!=null||root.right!=null)){  
         TreeNode tem=root.left;  
         root.left=root.right;  
         root.right=tem;  
         Mirror(root.left);  
         Mirror(root.right);  
     }  
    }
}
