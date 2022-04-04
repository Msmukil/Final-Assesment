package FinalAssesment;
import java.util.*;


public class SortStudents {
	Scanner sc = new Scanner(System.in);
	public SortStudents(List<Student> list) {
		System.out.println("Enter the choice");
		System.out.println("1.Sort by name" + "\n2.Sort by Id" + "\n3.Sort by Mark");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			Sorting sorting = new Sorting();
			list.sort(sorting);
			for(Student s : list) {
				System.out.println(s);
			}
			break;
		case 2:
			SortbyId sortbyid = new SortbyId();
			list.sort(sortbyid);
			for(Student s : list) {
				System.out.println(s);
			}

			break;
		case 3:
			SortbyMark sortbymark = new SortbyMark();
			list.sort(sortbymark);
			for(Student s : list) {
				System.out.println(s);
			}

			default:
				break;

	}


	}
}
