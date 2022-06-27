
// create threads by extending thread class
package corejava;
class ThreadExample extends Thread {

	// initiated run method for thread
	
	public void run () {
		System.out.println("Thread started Running");
	}
	public static void main(String[] args) {

ThreadExample th= new ThreadExample();
		th.start();
			
		}
	}


