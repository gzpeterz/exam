package Second;

public class Hardware extends Maintenance{

	public Hardware(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	public void Work(){
		System.out.println("Ա����Ϊ"+super.getId()+"��"+super.getName()+"Ա��,�����޸���ӡ��");
	}
}
