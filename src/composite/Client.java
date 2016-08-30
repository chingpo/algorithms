package composite;

public class Client {
public static void main(String[] args) {
		AbstractFile f2,f3;
		Floder f1;
		f1=new Floder("我的收藏");
			f2=new ImageFile("头像");
			f3=new TextFile("文本");
			f1.add(f2);
			f1.add(f3);

			f1.killVirus();//文件夹杀毒，文件夹里的文件也进行了同样的操作



}
}
