package lab1;

public class Rafael {
		
	private String name;
	private String Position;
	private String arr[];
		
		
	public Rafael(){
		name = "Rafael";
		Position = "full back";
		arr = new String[] {"Ferdinand","Vidic","Evra","Carick"};
		System.out.println("Rafael");
		
	}
	public Rafael(int a){
		
		System.out.println("Rafael Overloading 1");
		
	}
	public String getName(){
		
		return name;
	}
public String getPosition(){
		
		return Position;
	}
public String[] getArr(){
	
	return arr;
}
}
