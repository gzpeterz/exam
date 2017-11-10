package Second;

public class Personnel {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Personnel(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void Work(){
		System.out.println("我负责工作");
	}
	public void Same(Personnel personnel){
		personnel.Work();
	}
	public Personnel(){}
	public static void main(String[] args) {
		Personnel personnel=new Personnel();
		personnel.Same(new Javaee("王五", 9527));
	}
}
