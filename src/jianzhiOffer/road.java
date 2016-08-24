package jianzhiOffer;
//请设计一个函数，用来判断在一个矩
//阵中是否存在一条包含某字符串所有字符的路
//径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左
//，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径
//不能再进入该格子。 例如 a b c e s f c s a d e e 矩阵中包
//含一条字符串"bcced"的路径，但是矩阵中不
//包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一
//行第二个格子之后，路径不能再次进入该格子。
public class road {		
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    if(matrix.length!=rows*cols) return false;
    boolean [] judge=new boolean [rows*cols];
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          if(has(matrix,rows,cols,str,judge,i,j,0))return true; 
        }
    }
      return false; 
    }
    public boolean has(char[] matrix, int rows, int cols, char[] str,boolean []judge,int i,int j,int k){
    if(k==str.length)return true;
    if(j==cols){i++;j=0;}
    if(j==-1){i--;j=cols-1;};
    if(i<0||i>=rows||judge[i*cols+j]==true||matrix[i*cols+j]!=str[k])return false;
    judge[i*cols+j]=true;
    boolean sign=has(matrix,rows,cols,str,judge,i+1,j,k+1)
        ||has(matrix,rows,cols,str,judge,i,j+1,k+1)
        ||has(matrix,rows,cols,str,judge,i,j-1,k+1)
        ||has(matrix,rows,cols,str,judge,i-1,j,k+1);
    judge[i*cols+j]=false;   
    return sign;   
         
    }
	public static void main(String[] args) {  
	        char[] matrix = "abcesfcsadee".toCharArray();  
	        road a = new road();  
	        System.out.println(a.hasPath(matrix, 3, 4, "bcced".toCharArray()));  
	        System.out.println(a.hasPath(matrix, 3, 4, "abcd".toCharArray()));  
	        System.out.println(a.hasPath(matrix, 3, 4, "see".toCharArray()));  
	        System.out.println(a.hasPath(matrix, 3, 4, "abcb".toCharArray()));  
	          
	    }  


}
