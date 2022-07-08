//Edited BY Akshay
public class Pthread {

	public static void main(String[] args) { // this is main thread 
		Thread t= Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}

	
}
