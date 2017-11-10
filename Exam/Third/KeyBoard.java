package Third;

public class KeyBoard implements USB{

	@Override
	public void close() {
		System.out.println("¼üÅÌ¹Ø±Õ");
	}

	@Override
	public void open() {
		System.out.println("¼üÅÌ¿ªÆô");
	}

}
