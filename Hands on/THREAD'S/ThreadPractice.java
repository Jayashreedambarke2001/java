package corejava;

 class ThreadPractice extends Thread{


		// Initiated run method for thread
		public void run() {
			int i = 0;
			while (i < 10) {
				System.out.println("Good Morning");
				try {
					Thread.sleep(200);
				} catch (InterruptedException i1) {
					i1.printStackTrace();
				}
				System.out.println("welcome to mumbai");
				i++;

			}
		}

		public static void main(String[] args) {

			ThreadPractice th = new ThreadPractice();
			// Invoking Thread
			th.start();

		}
	}
