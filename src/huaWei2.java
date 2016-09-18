import java.util.*;


public class huaWei2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String fileName=null;
		int endIndex=-1,errLine=0;
		ErrLog errLog=null;
		HashMap<String,ErrLog> map=new HashMap<String,ErrLog>();
		
		while(in.hasNext()){
			fileName=in.next();
			errLine=in.nextInt();
			endIndex=fileName.lastIndexOf('\\');
			StringBuilder sb=new StringBuilder();
			String s=sb.append(endIndex<0?fileName:fileName.substring(endIndex+1)).append(" ").append(errLine).toString();
	        errLog=map.get(s);
	        if(errLog==null){
	      //  	map.put(s, new ErrLog(fileName, 1));
	        }else errLog.seat++;
	        in.close();
			
			
		}
		
	}
	class ErrLog{
		int mark;
		String name;
		int seat;
//		int count;
		public ErrLog(String name,int size){
			super();
			this.name=name;
			this.seat=mark++;
//			this.count=count;
		}
		
		
	}

}
