package Third;

public class Mouse implements USB{

	@Override
	public void close() {
		System.out.println("鼠标关闭");	
	}

	@Override
	public void open() {
		System.out.println("鼠标开启");	
	}
	
}
