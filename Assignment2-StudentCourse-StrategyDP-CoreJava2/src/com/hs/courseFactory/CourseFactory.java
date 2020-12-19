package com.hs.courseFactory;

import com.hs.Comp.JavaCourse;
import com.hs.Comp.PhpCourse;
import com.hs.Comp.DotNetCourse;
import com.hs.Comp.Student;
import com.hs.Comp.ICourse;

public class CourseFactory {

	
	public static Student getcourseTypeInstance(String courseType) {
		ICourse icourse=  null;
		if (courseType.equalsIgnoreCase("Php"))
			icourse=new PhpCourse();
		else if (courseType.equalsIgnoreCase("DotNet"))
			icourse=new DotNetCourse();
		else if (courseType.equalsIgnoreCase("Java"))
			icourse=new JavaCourse();
		else 
			throw new IllegalArgumentException("Invalid course Type");
		//Create target class object
		Student stud = new Student();
		//Assign dependent class object to target class object
		stud.setcourseServiece(icourse);
		return stud;
	}
	
	
}
