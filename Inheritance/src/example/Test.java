package example;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager(1, "John", "Travel", 100000, 
				new String[] {"P1", "P2"}, 10);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
		
		System.out.println("--------------------------------------");
		Developer developer = new Developer(2, "Bran", "Travel", 100, 
				"Full Stack Java");
		developer.work();
		
		System.out.println("--------------------------------------");
		new Tester(3, "Sdsajk", "travel", 1, new String[] {"Junit"}).work();
		
		
		
	}
}
