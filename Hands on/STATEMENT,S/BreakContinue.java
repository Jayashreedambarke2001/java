package corejava;

public class BreakContinue {

			public static void main(String[] args) {
			for (int i= 0; i<10;i++) {
				if (i==4) {
					continue;
				}
				
				else if (i==8) {
					break;
				}
				System.out.println(i);
				
			}
			}
}


