package corejava;

import java.util.ArrayList;
import java.util.List;

class StudentJavaBean {
	 private int id;
	 private String name1;
	 public List<SubjectJavaBean> subjects;


	 public int getId() {
	 	return id;
	 }

	 public void setId(int id) {
	 	this.id = id;
	 }

	 public String getName1() {
	 	return name1;
	 }

	 public void setName1(String name1) {
	 	this.name1 = name1;
	 }

	 public List<SubjectJavaBean> getSubjects() {
	 	return subjects;

	 }

	 public void setSubjects(List<SubjectJavaBean> subjects) {
	 	this.subjects = subjects;
	 }
}

