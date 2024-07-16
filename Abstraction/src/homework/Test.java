package homework;

public class Test {
	public static void main(String[] args) {
		TouchScreenLaptop laptop = new HPNotebook();
		laptop.scroll();
		laptop.click();
		
		System.out.println();
		
		laptop = new DELLNotebook();
		laptop.scroll();
		laptop.click();
	}
}
