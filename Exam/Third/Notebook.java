package Third;

public class Notebook{
	public void run() {
		System.out.println("�ʼǱ�������");
	}
	public void shutDown() {
		System.out.println("�ʼǱ��Ĺػ�");
	}
	public void useUSB(USB usb) {
		if(usb!=null)
		usb.open();
		usb.close();
	}
}
