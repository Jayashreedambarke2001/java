package corejava;

import java.util.ArrayList;
import java.util.List;

public class StudentMainJavaBean {


	public static void main(String[] args) {
		StudentJavaBean student =new StudentJavaBean();

 		List<SubjectJavaBean> subjects = new ArrayList<SubjectJavaBean>();
 SubjectJavaBean  subject1=new SubjectJavaBean();

 	subject1.setCode(210);
 	subject1.setName("ENGLISH");
 	subjects.add(subject1);

 	SubjectJavaBean subject2 = new SubjectJavaBean();
 	subject2.setCode(220);
 	subject2.setName("MARATHI");
 	subjects.add(subject2);

 	SubjectJavaBean subject3 = new SubjectJavaBean();
 	subject3.setCode(230);
 	subject3.setName("COMPUTER");
 	subjects.add(subject2);

 	// setting bean values
 student.setId(101);
 student.setName1("JAYASHREE");
 student.setSubjects(subjects);
  
 //GETTING BEAN VALUES
 System.out.println("Student Id : " + student.getId());
 System.out.println("Student name : " + student.getName1());

 List<SubjectJavaBean> subjectList = student.getSubjects();
 for (int i = 0; i < subjectList.size(); i++) {
 	SubjectJavaBean subject = subjectList.get(i);
 	
 	System.out.println("Student subject " + (i + 1) + " : " + subject.getCode() 
 	+ " : " + subject.getName());
 	}


	}

}
