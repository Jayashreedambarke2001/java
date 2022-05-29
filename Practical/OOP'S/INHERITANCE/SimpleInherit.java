package corejava;

		class SimpleInherit {
			public void print() {
				System.out.println("JAYASHREE");	
			}
		}
		class SimpleOne extends SimpleInherit {
			public void show() {
				System.out.println("DAMABRKE");
			}
		}

		class RunMethod{
			
			public static void main(String[] args) {		
				SimpleOne s= new SimpleOne();
				s.print();
				s.show();
				s.print();
				}
		}

