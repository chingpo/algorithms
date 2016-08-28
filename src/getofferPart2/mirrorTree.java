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




/*
 * 用来判断一颗二叉树是不是对
 * 称的。注意，如果一个二叉树同此二叉
 * 树的镜像是同样的，定义其为对称的。 */
//
//public class Solution {
//    boolean isSymmetrical(TreeNode pRoot)
//    {
//        TreeNode node = getMirror(pRoot);
//        return isSymmetrical(pRoot,node);
//    }
//    boolean isSymmetrical(TreeNode pRoot,TreeNode node)
//    {
//        if(pRoot == null && node == null){
//            return true;
//        }else if(pRoot == null || node  == null){
//            return false;
//        }
//        if(pRoot.val == node.val){
//            return isSymmetrical(pRoot.left,node.left)&&isSymmetrical(pRoot.right,node.right);
//        }
//       return false;
//    }
//     
//    TreeNode getMirror(TreeNode pRoot){
//        if (pRoot == null) {
//            return null;
//        }
//        TreeNode root = new TreeNode(pRoot.val);
//        root.right = getMirror(pRoot.left);
//        root.left = getMirror(pRoot.right);
//        return root;
//    }
//  
//}