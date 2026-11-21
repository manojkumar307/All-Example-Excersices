package threads;

public class Demo {

	public static void main(String[] args) {
		MultiThreading d1 = new MultiThreading();
		MultiThreading d2 = new MultiThreading();
		MultiThreading d3 = new MultiThreading();
		
		d1.setName("ADD");
		d2.setName("PRINTCHAR");
		d3.setName("PRINTNUM");
		
		d1.start();
		d2.start();
		d3.start();
		
	}
}
