package Second;

public class Javaee extends ResearchEmployee{

	public Javaee(String name, int id) {
		super(name, id);
	}
	public void Work(){
		System.out.println("Ա����Ϊ"+super.getId()+"��"+super.getName()+"Ա��,�����з��Ա���վ");
	}

}
