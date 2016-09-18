import java.util.Scanner;


public class huaWei3 {
	public static String poker(String[] a,String[] b, String left, String right){
		String outString=null;
		if(a.length == 4 && b.length != 4){
            outString = left;
        }else if(b.length == 4 && a.length != 4){
            outString = right;
        }else if(a.length==b.length){
        		if(no(a[0])>no(b[0])) outString=left;
        		else outString=right;	
        }else if(a.length==3&&b.length==1){
        	outString=left;
        	
        }else if(b.length==3&&a.length==1){
        	outString=right;
        }else{
        	outString="ERROR";
        }
		
		return outString;
		
	}

private static int no(String string) {
		
		return "345678910JQKA2jokerJOKER".indexOf(string);
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	while(in.hasNext()){
		  String line = in.nextLine();
		  if(line.contains("joker JOKER")){
             String outString = "joker JOKER";
             System.out.println(outString);
          }else{
		  String[] a = line.split("-");
          String[] left = a[0].split(" ");
          String[] right = a[1].split(" ");
          System.out.print(poker(left,right,a[0],a[1]));
            }	
	}in.close();
	}
}

//public static void main(String[] args) {
//	System.out.println("345678910JQKA2jokerJOKER".indexOf("JOKER"));
//}
//}


//4 4 4 4-joker JOKER