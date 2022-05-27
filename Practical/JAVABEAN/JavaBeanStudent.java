package corejava;

public class JavaBeanStudent {
 private int id;
 private String Name;
 private boolean acrtive;
 

	public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public boolean isAcrtive() {
	return acrtive;
}


public void setAcrtive(boolean acrtive) {
	this.acrtive = acrtive;
}


	public static void main(String[] args) {
JavaBeanStudent j=new JavaBeanStudent();

//setting bean values
j.setId(10);
j.setName("NILESH");
j.setAcrtive(true);

// getting bean values
System.out.println("id:"+j.getId());
System.out.println("name:"+j.getName());
System.out.println("active:"+j.isAcrtive());
	}

}
