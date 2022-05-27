package corejava;

public class JavaBeanArrayStudent {

public int id;
public String name;
public String[] Subjects;

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

public String[] getSubjects() {
	return Subjects;
}

public void setSubjects( String[]subjects) {
	this.Subjects=subjects;
	
}

	public static void main(String[] args) {
JavaBeanArrayStudent student=new JavaBeanArrayStudent();
String[] Subject= {"ENGLISH","SCIENCE","COMPUTER"};
 
//setting bean values
 student.setId(101);
student.setName("JAYASHREE");
student.setSubjects(Subject);

//getting bean values
System.out.println(" Student id:"+student.getId());
System.out.println(" Student name:"+student.getName());


String[] subjectArray = student.getSubjects();
for (int i = 0; i < subjectArray.length; i++) {
	System.out.println("Student subject " + (i + 1) + " : " + subjectArray[i]);

	}

}
}
