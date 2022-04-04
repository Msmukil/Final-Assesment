package FinalAssesment;

import java.util.*;

public class AddStudent {
	Scanner sc = new Scanner(System.in);
	public AddStudent(List<Student> list) {
		System.out.println("Enter the number of student you want add");
		int num = sc.nextInt();
		for(int j = 0;j < num;j++) {
			System.out.println("Enter the details");
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("Enter mark");
			double mark = sc.nextInt();
			System.out.println("Enter course");
			String course = sc.next();
			
			list.add(new Student(id,name,mark,course));
			System.out.println("Added");
			Iterator<Student> i = list.iterator();
			while(i.hasNext()) {
				Student s = i.next();
				System.out.println(s);
			}

		}
	}

}
