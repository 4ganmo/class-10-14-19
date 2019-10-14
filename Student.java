//imports
public class Student extends Person implements Comparable<Student> {
	private String className;
	private Integer rating;
	
	
	public Student() throws NameException{
		super();
		rating = 5;
		
	}
	
	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Integer getRating() {
		return rating;
		
	}

}
