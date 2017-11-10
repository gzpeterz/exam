package Third;

public class Test {
	public static void main(String[] args) {
		Notebook nb=new Notebook();
		nb.run();
		Mouse m=new Mouse();
		nb.useUSB(m);
		KeyBoard kb=new KeyBoard();
		nb.useUSB(kb);
		nb.shutDown();
	}
}
