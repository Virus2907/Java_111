package ques1;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	public static void main(String[] args) {
		
		

	}
	public Student(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age = age;	
		}
		else {
			System.out.println("Enter valid age");
		}
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;	
		}
		else {
			System.out.println("Enter valid data");
		}
	}

}
