package com.hs.Comp;

public class Student {
	
	private ICourse course;
		
	public void setcourseServiece(ICourse course) {
		this.course=course;
	}
	
	
	public void courseStudy(String student) {
		
		System.out.println("Hey "+student+" Pleace choose a course");
		course.courseChoose();
		System.out.println(student+" has choosen a course");
		
	}



}
