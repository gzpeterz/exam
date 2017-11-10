package Second;

public class Android extends ResearchEmployee{

	public Android(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	public void Work(){
		System.out.println("员工号为"+super.getId()+"的"+super.getName()+"员工,正在研发淘宝手机客户端");
	}
}
