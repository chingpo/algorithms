package composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
	void killVirus();

}
class ImageFile implements AbstractFile{
   private String name;
    public ImageFile(String name) {
    	super();
		this.name=name;
	}
	@Override
	public void killVirus() {
		
		System.out.println("图片杀毒"+name);
	}
	
}

class TextFile implements AbstractFile{
	   private String name;
	    public TextFile(String name) {
	    	super();
			this.name=name;
		}
		@Override
		public void killVirus() {
			
			System.out.println("文本杀毒"+name);
		}
		
	}
class Floder implements AbstractFile{
	   private String name;
	   private List<AbstractFile> list=new ArrayList<>();
	    public Floder(String name) {
	    	super();
			this.name=name;
		}
	    public void add(AbstractFile file){
	    	list.add(file);
	    }
	    public void remove(AbstractFile file){
	    	list.remove(file);
	    }
	    public void getChild(int index){
	    	list.get(index);
	    }
	    
		@Override
		public void killVirus() {
			
			System.out.println("文件夹杀毒"+name);
			for(AbstractFile file:list){
				file.killVirus();
			}
		}
		
	}