package Second;

public class Net extends Maintenance{

	public Net(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	public void Work(){
		System.out.println("员工号为"+super.getId()+"的"+super.getName()+"员工,正在检查网络是否畅通");
	}
}
