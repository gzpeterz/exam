package Third;

public class Notebook{
	public void run() {
		System.out.println("笔记本的运行");
	}
	public void shutDown() {
		System.out.println("笔记本的关机");
	}
	public void useUSB(USB usb) {
		if(usb!=null)
		usb.open();
		usb.close();
	}
}
