package FinalAssesment;
import java.util.*;


public class GetDetails {
	Scanner sc = new Scanner(System.in);
	public GetDetails(List<Student> list) {
		System.out.println("get student");
		System.out.println("Enter Student ID");
		int getid = sc.nextInt();
		Iterator<Student> iterator3 = list.iterator();
		while(iterator3.hasNext()) {
			Student next = iterator3.next();
			if(next.getId() == getid) {
				System.out.println(next);
			}

	}


	}
}
