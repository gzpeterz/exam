package Third;

public class Mouse implements USB{

	@Override
	public void close() {
		System.out.println("���ر�");	
	}

	@Override
	public void open() {
		System.out.println("��꿪��");	
	}
	
}
