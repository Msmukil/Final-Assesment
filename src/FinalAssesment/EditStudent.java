package FinalAssesment;
import java.util.*;


public class EditStudent {
	Scanner sc = new Scanner(System.in);
	public EditStudent(List<Student> list) {
	System.out.println("Enter the id to Edit ");
	int id0 = sc.nextInt();
	 ListIterator<Student> it1 = list.listIterator();
	while(it1.hasNext()) {
		Student s = it1.next();
		if(s.getId() == id0)  {
			System.out.println("Enter new details");
			System.out.println("Enter new name");
			String newName = sc.next();
			System.out.println("Enter new mark");
			double newMark = sc.nextDouble();
			System.out.println("Enter new course");
			String newCourse = sc.next();
			it1.set(new Student(id0,newName,newMark,newCourse)) ; 
		}
	}
	System.out.println("Edited sucessfully");
	Iterator<Student> iterator = list.iterator();
	while(iterator.hasNext()) {
		Student s = iterator.next();
		System.out.println(s);
	}

	}
}
