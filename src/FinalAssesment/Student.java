package FinalAssesment;

public class Student {
	int id;
	String Name;
	double mark;
	String course;
	
	
		
	public Student(int id, String name, double mark, String course) {
		super();
		this.id = id;
		Name = name;
		this.mark = mark;
		this.course = course;
	}
	
	
	

	public int getId() {
		return id;
	}




	public String getName() {
		return Name;
	}




	public double getMark() {
		return mark;
	}




	public String getCourse() {
		return course;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", mark=" + mark + ", course=" + course + "]";

		
	
		
	}
		}
	
	
	


