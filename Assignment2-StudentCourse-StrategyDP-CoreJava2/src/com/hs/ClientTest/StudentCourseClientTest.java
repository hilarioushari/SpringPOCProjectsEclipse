package com.hs.ClientTest;

import com.hs.Comp.Student;
import com.hs.courseFactory.CourseFactory;

public class StudentCourseClientTest {

	public static void main(String[] args) {
		Student stud = CourseFactory.getcourseTypeInstance("Java");
		stud.courseStudy("Harihara");
		

	}

}
