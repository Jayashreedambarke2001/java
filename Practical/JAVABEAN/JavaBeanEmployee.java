package corejava;

import java.io.Serializable;

public class JavaBeanEmployee implements Serializable {

	public JavaBeanEmployee() {
	}
	private int id;
   private String name;

	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public static void main(String[] args) {

		JavaBeanEmployee e=new JavaBeanEmployee();
		e.setId(5);
		e.setName("JAYASHREE");
		System.out.println("id:"+e.getId());
		System.out.println("name:"+e.getName());
		}

}
