package interfaces;

//Se pueden implementar varias interfaces en una clase
public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Go honda");
	}

	@Override
	public void stop() {
		System.out.println("Stop honda");
	}

}
