package com.Hibernate.projectwithmaven;

import com.Hibernate.projectwithmaven.dao.StudentDao;
import com.Hibernate.projectwithmaven.model.Student;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();	
    	
    	// insert values 
		Student student = new Student("Suraj", "Suryawanshi", "surajs@gmail.com");
		Student student1 = new Student("Priya", "Sharma", "priyas@gmail.com");
		Student student2 = new Student("Vinayak", "Suryawanshi", "vinayaks@gmail.com");
		
		//save values
		studentDao.saveStudent(student);
		studentDao.saveStudent(student1);
		studentDao.saveStudent(student2);
		
		
		studentDao.getStudent(1);
		studentDao.loadStudent(2);
		studentDao.getStudentById(3);
    }
}
