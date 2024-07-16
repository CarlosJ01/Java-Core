package RunTimeBilding;

import Interfaces.AppleLaptop;

public class MackBook implements AppleLaptop{
	@Override
	public void start() {
		System.out.println("Macbook Start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Macbook Shutdown");
	}
}
