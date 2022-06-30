package corejava;


    class Source
	{
	    public static void main(String[] args) {
	        
	        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);
	        double salary = m.calculateSalary(); 
	        System.out.println("Manager's Salary : "+salary);
	        System.out.println("Manager's Transport Allowance (15%) : "+m.calculateTransportAllowance(m, 15));   
	    }
	}

		 

