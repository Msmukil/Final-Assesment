package FinalAssesment;

import java.util.Comparator;

public class SortbyMark implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
			return (int)(o1.getMark() - o2.getMark() );
	}
	

	}

