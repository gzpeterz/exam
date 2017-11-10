package Second;

public class Javaee extends ResearchEmployee{

	public Javaee(String name, int id) {
		super(name, id);
	}
	public void Work(){
		System.out.println("员工号为"+super.getId()+"的"+super.getName()+"员工,正在研发淘宝网站");
	}

}
