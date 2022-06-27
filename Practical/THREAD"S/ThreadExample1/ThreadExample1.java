
// create thread by using runable interface
package corejava;

public class ThreadExample1 implements Runnable {
	
	// initiated run method for thread
	
		public void run () {
			System.out.println("Thread is Running succesfully");
		}
		

	public static void main(String[] args) {
		ThreadExample1 th= new ThreadExample1();
		// initializing thread object
		Thread tt =new Thread(th);
		//Invoking thread
		tt.start();
			
	}

}
