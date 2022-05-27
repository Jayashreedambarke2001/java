package corejava;

import java.util.ArrayList;
import java.util.List;

public class JavaBeanList {

		
		public int id;
		public String name;
		public List<String> subjects;


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


		public List<String> getSubjects() {
			return subjects;
		}


		public void setSubjects(List<String> subjects) {
			this.subjects = subjects;
		}


	public static void main(String[] args) {
 JavaBeanList student=new JavaBeanList();
 List<String> subjects = new ArrayList<String>();

 subjects.add("ENGLISH");
 subjects.add("HINDI");
 subjects.add("MARATHI");

 //setting bean value
 student.setId(101);
 student.setName("JAYASHREE");
 student.setSubjects(subjects);

 //getting bean values
 System.out.println(" Student id:"+student.getId());
 System.out.println(" Student name:"+student.getName());
 
 List<String> subjectList = student.getSubjects();
 for (int i = 0; i < subjectList.size(); i++) {
	 System.out.println("Student subject " + (i + 1) + " : " + subjectList.get(i));


	}

}
}
