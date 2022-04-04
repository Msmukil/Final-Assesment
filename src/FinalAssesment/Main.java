package FinalAssesment;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		ArrayList<Student> list = new ArrayList<Student>();
		do {
			System.out.println();
			System.out.println("1.Add Student" + "\n2.Edit Student" + "\n3.Delete Student" + "\n4. List of Students"
			+ "\n5.Get Student" + "\n6. Sort the list of students" + "\n7.Exit" + "\nEnter choices");
	
		 choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			new AddStudent(list);
			break;
		
		case 2:
			new EditStudent(list);
			break;
			
		case 3:
			new DeleteStudent(list);
			break;
			
		case 4:
			new Display(list);
			break;
			
		case 5:
			new GetDetails(list);
			break;
		case 6:
			new SortStudents(list);
//			System.out.println("Enter the choice");
//			System.out.println("1.Sort by name" + "\n2.Sort by Id" + "\n3.Sort bu Mark");
//			int ch = sc.nextInt();
//			switch (ch) {
//			case 1:
//				Sorting sorting = new Sorting();
//				list.sort(sorting);
//				break;
//			case 2:
//				SortbyId sortbyid = new SortbyId();
//				list.sort(sortbyid);
//				break;
//			case 3:
//				SortbyMark sortbymark = new SortbyMark();
//				list.sort(sortbymark);
//				default:
//					break;
//			}
			break;
		case 7:
			System.out.println("Thank you");
			break;
			
			default :System.out.println("enter valid choices");
			break;
		}
		} while (choice !=7);
		
		}
	
}




			
		
		
	


