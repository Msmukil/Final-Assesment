package FinalAssesment;
import java.util.*;


public class Display {
	Scanner sc = new Scanner(System.in);
	public Display(List<Student> list) {
		System.out.println("List of student");
		Iterator<Student> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Student next = iterator2.next();
			System.out.println(next);

	}


}
}
